package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0067i;
import j$.nio.file.EnumC0050a;
import j$.nio.file.H;
import j$.nio.file.I;
import j$.nio.file.J;
import j$.nio.file.K;
import j$.nio.file.Path;
import java.io.File;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class o implements Path {
    private static final Pattern h = Pattern.compile("/+");
    private final AbstractC0067i a;
    private final String b;
    private final List c;
    private final boolean d;
    private final String e;
    private final String f;
    private volatile byte[] g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(j$.nio.file.AbstractC0067i r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "/"
            boolean r3 = r9.startsWith(r0)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L14
            java.lang.String r9 = ""
            java.util.List r9 = java.util.Collections.singletonList(r9)
        L12:
            r4 = r9
            goto L33
        L14:
            java.util.regex.Pattern r0 = j$.desugar.sun.nio.fs.o.h
            java.lang.String[] r9 = r0.split(r9)
            j$.util.stream.Stream r9 = j$.util.DesugarArrays.stream(r9)
            j$.desugar.sun.nio.fs.n r0 = new j$.desugar.sun.nio.fs.n
            r1 = 0
            r0.<init>(r1)
            j$.util.stream.Stream r9 = r9.filter(r0)
            j$.util.stream.Collector r0 = j$.util.stream.Collectors.toUnmodifiableList()
            java.lang.Object r9 = r9.collect(r0)
            java.util.List r9 = (java.util.List) r9
            goto L12
        L33:
            r1 = r7
            r2 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.o.<init>(j$.nio.file.i, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // j$.nio.file.Path
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final o I(Path path) {
        path.getClass();
        if (path instanceof o) {
            o parent = getParent();
            if (parent == null) {
                return (o) path;
            }
            return parent.r(path);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final boolean E(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.f;
        AbstractC0067i abstractC0067i = this.a;
        String str2 = this.e;
        return new o(abstractC0067i, str2, str2, str).r(this);
    }

    @Override // j$.nio.file.Path
    public final J J(K k, H... hArr) {
        o(k, hArr, new I[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final Path Y(Path path) {
        int i = 0;
        if (path instanceof o) {
            if (this.d == ((o) path).d) {
                List list = ((o) path).c;
                List list2 = this.c;
                int size = list2.size();
                int size2 = list.size();
                while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
                    i++;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = i; i2 < size; i2++) {
                    arrayList.add("..");
                }
                while (i < size2) {
                    arrayList.add((String) list.get(i));
                    i++;
                }
                return new o(this.a, false, arrayList, this.e, this.f);
            }
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return E(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || compareTo((o) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new o(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final AbstractC0067i getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (this.d) {
            String str = this.e;
            AbstractC0067i abstractC0067i = this.a;
            String str2 = this.f;
            return new o(abstractC0067i, str2, str, str2);
        }
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return j$.nio.file.l.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] n() {
        if (this.g == null) {
            this.g = this.b.getBytes(q.a());
        }
        return this.g;
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        String str;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str2 : this.c) {
            str2.getClass();
            if (!str2.equals(".")) {
                if (!str2.equals("..")) {
                    arrayDeque.add(str2);
                } else {
                    arrayDeque.removeLast();
                }
            }
        }
        if (this.d) {
            str = "/";
        } else {
            str = "";
        }
        return new o(this.a, str + g.a(arrayDeque), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final J o(K k, H[] hArr, I... iArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return r(getFileSystem().o(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return I(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path s(j$.nio.file.m[] mVarArr) {
        AbstractC0067i abstractC0067i = this.a;
        abstractC0067i.D().a(this, EnumC0050a.READ);
        if (Arrays.asList(mVarArr).contains(j$.nio.file.m.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new o(abstractC0067i, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return z(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new o(this.a, g.a(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final o getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new o(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        return p.f(this);
    }

    @Override // j$.nio.file.Path
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        List list = this.c;
        int size = list.size();
        if (size != 0) {
            boolean z = this.d;
            if (size != 1 || z) {
                StringBuilder sb = new StringBuilder();
                if (z) {
                    sb.append("/");
                }
                sb.append(g.a(list.subList(0, size - 1)));
                return new o(this.a, sb.toString(), this.e, this.f);
            }
            return null;
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((o) path).b);
    }

    @Override // j$.nio.file.Path
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o r(Path path) {
        if (path instanceof o) {
            if (((o) path).d) {
                return (o) path;
            }
            return new o(this.a, this.b + "/" + String.valueOf(path), this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    public final boolean z(Path path) {
        int nameCount;
        path.getClass();
        if (!(path instanceof o)) {
            return false;
        }
        if (this.d != path.isAbsolute() || this.c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    private o(AbstractC0067i abstractC0067i, boolean z, List list, String str, String str2) {
        this.a = abstractC0067i;
        this.d = z;
        this.c = list;
        String str3 = z ? "/" : "";
        this.b = str3 + g.a(list);
        this.e = str;
        this.f = str2;
    }
}
