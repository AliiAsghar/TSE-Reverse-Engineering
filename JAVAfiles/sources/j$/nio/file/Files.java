package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.InterfaceC0055e;
import j$.nio.file.attribute.InterfaceC0058h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Files {
    static {
        j$.desugar.sun.nio.fs.g.c(new Object[]{D.CREATE_NEW, D.WRITE});
    }

    public static void a(Path path) {
        path.getFileSystem().D().f(path);
    }

    public static boolean b(Path path, m... mVarArr) {
        if (mVarArr.length == 0) {
            d(path);
        }
        try {
            int length = mVarArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                m mVar = mVarArr[i];
                if (mVar == m.NOFOLLOW_LINKS) {
                    i++;
                    z = false;
                } else {
                    mVar.getClass();
                    throw new AssertionError("Should not get here");
                }
            }
            if (z) {
                d(path).a(path, new EnumC0050a[0]);
            } else {
                d(path).x(path, InterfaceC0058h.class, m.NOFOLLOW_LINKS);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static SeekableByteChannel c(Path path, p... pVarArr) {
        Set set;
        if (pVarArr.length == 0) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, pVarArr);
            set = hashSet;
        }
        return d(path).q(path, set, new j$.nio.file.attribute.m[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long copy(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        long transferTo;
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption == StandardCopyOption.REPLACE_EXISTING) {
                i++;
                z = true;
            } else {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
            }
        }
        if (z) {
            try {
                d(path).g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream w = d(path).w(path, D.CREATE_NEW, D.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    transferTo = ((InputStreamRetargetInterface) inputStream).transferTo(w);
                } else {
                    transferTo = DesugarInputStream.transferTo(inputStream, w);
                }
                if (w != null) {
                    w.close();
                }
                return transferTo;
            } catch (Throwable th) {
                if (w != null) {
                    try {
                        w.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e != null) {
                throw e;
            }
            throw e2;
        }
    }

    private static j$.nio.file.spi.d d(Path path) {
        return path.getFileSystem().D();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        m[] mVarArr;
        j$.nio.file.spi.d d = d(path);
        if (d(path2).equals(d)) {
            d.o(path, path2, copyOptionArr);
        } else {
            int length = copyOptionArr.length;
            int i = length + 2;
            CopyOption[] copyOptionArr2 = new CopyOption[i];
            for (int i2 = 0; i2 < length; i2++) {
                CopyOption copyOption = copyOptionArr[i2];
                if (copyOption != StandardCopyOption.ATOMIC_MOVE) {
                    copyOptionArr2[i2] = copyOption;
                } else {
                    throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
                }
            }
            copyOptionArr2[length] = m.NOFOLLOW_LINKS;
            copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < i; i3++) {
                CopyOption copyOption2 = copyOptionArr2[i3];
                if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                    z2 = true;
                } else if (copyOption2 == m.NOFOLLOW_LINKS) {
                    z = false;
                } else if (copyOption2 == StandardCopyOption.COPY_ATTRIBUTES) {
                    z3 = true;
                } else {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
            }
            if (z) {
                mVarArr = new m[0];
            } else {
                mVarArr = new m[]{m.NOFOLLOW_LINKS};
            }
            InterfaceC0058h x = d(path).x(path, InterfaceC0058h.class, mVarArr);
            if (!x.isSymbolicLink()) {
                if (z2) {
                    d(path2).g(path2);
                } else if (b(path2, new m[0])) {
                    throw new FileAlreadyExistsException(path2.toString());
                }
                if (x.isDirectory()) {
                    path2.getFileSystem().D().c(path2, new j$.nio.file.attribute.m[0]);
                } else {
                    InputStream v = path.getFileSystem().D().v(path, new p[0]);
                    try {
                        copy(v, path2, new CopyOption[0]);
                        if (v != null) {
                            v.close();
                        }
                    } catch (Throwable th) {
                        if (v != null) {
                            try {
                                v.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (z3) {
                    try {
                        ((InterfaceC0055e) path2.getFileSystem().D().h(path2, InterfaceC0055e.class, new m[0])).a(x.lastModifiedTime(), x.lastAccessTime(), x.creationTime());
                    } catch (Throwable th3) {
                        try {
                            a(path2);
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                a(path);
            } else {
                throw new IOException("Copying of symbolic links not supported");
            }
        }
        return path2;
    }

    public static Path readSymbolicLink(Path path) {
        return d(path).z(path);
    }
}
