package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes5.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {
    boolean E(Path path);

    Path I(Path path);

    J J(K k, H... hArr);

    Path Y(Path path);

    boolean endsWith(String str);

    boolean equals(Object obj);

    Path getFileName();

    AbstractC0067i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    Path normalize();

    J o(K k, H[] hArr, I... iArr);

    Path r(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    Path s(m... mVarArr);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    int v(Path path);

    boolean z(Path path);
}
