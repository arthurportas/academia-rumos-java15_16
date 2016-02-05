package com.example.holywood.domain;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.StandardCopyOption.*;

public class CopyFileTree implements FileVisitor<Path> {

	private Path source;
	private Path target;

	public CopyFileTree(Path source, Path target) {
		this.source = source;
		this.target = target;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path arg0, IOException arg1) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes arg1) throws IOException {
		Path newdir = target.resolve(source.relativize(dir));
		try {
			Files.copy(dir, newdir);
		} catch (FileAlreadyExistsException x) {
			// ignore
		} catch (IOException x) {
			System.err.format("Unable to create: %s: %s%n", newdir, x);
			return FileVisitResult.SKIP_SUBTREE;
		}

		return FileVisitResult.CONTINUE;

	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes arg1) throws IOException {
		Path newdir = target.resolve(source.relativize(file));
		try {
			Files.copy(file, newdir, REPLACE_EXISTING);
		} catch (IOException x) {
			System.err.format("Unable to copy: %s: %s%n", source, x);
		}

		return FileVisitResult.CONTINUE;

	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		if (exc instanceof FileSystemLoopException) {
			System.err.println("cycle detected: " + file);
		} else {
			System.err.format("Unable to copy: %s: %s%n", file, exc);
		}
		return FileVisitResult.CONTINUE;

	}

}
