package j$.nio.file;

import j$.nio.file.attribute.C0051a;
import j$.nio.file.attribute.C0059i;
import j$.nio.file.attribute.InterfaceC0055e;
import j$.nio.file.attribute.InterfaceC0058h;
import j$.util.C0096f;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class l {
    public static final H a = new E(Object.class, "OVERFLOW");
    public static final H b = new E(Path.class, "ENTRY_CREATE");
    public static final H c = new E(Path.class, "ENTRY_DELETE");
    public static final H d = new E(Path.class, "ENTRY_MODIFY");

    public static Iterator a(j$.desugar.sun.nio.fs.o oVar) {
        return new q(oVar);
    }

    public static /* synthetic */ StandardOpenOption b(D d2) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        StandardOpenOption standardOpenOption5;
        StandardOpenOption standardOpenOption6;
        StandardOpenOption standardOpenOption7;
        StandardOpenOption standardOpenOption8;
        StandardOpenOption standardOpenOption9;
        StandardOpenOption standardOpenOption10;
        if (d2 == null) {
            return null;
        }
        if (d2 == D.READ) {
            standardOpenOption10 = StandardOpenOption.READ;
            return standardOpenOption10;
        }
        if (d2 == D.WRITE) {
            standardOpenOption9 = StandardOpenOption.WRITE;
            return standardOpenOption9;
        }
        if (d2 == D.APPEND) {
            standardOpenOption8 = StandardOpenOption.APPEND;
            return standardOpenOption8;
        }
        if (d2 == D.TRUNCATE_EXISTING) {
            standardOpenOption7 = StandardOpenOption.TRUNCATE_EXISTING;
            return standardOpenOption7;
        }
        if (d2 == D.CREATE) {
            standardOpenOption6 = StandardOpenOption.CREATE;
            return standardOpenOption6;
        }
        if (d2 == D.CREATE_NEW) {
            standardOpenOption5 = StandardOpenOption.CREATE_NEW;
            return standardOpenOption5;
        }
        if (d2 == D.DELETE_ON_CLOSE) {
            standardOpenOption4 = StandardOpenOption.DELETE_ON_CLOSE;
            return standardOpenOption4;
        }
        if (d2 == D.SPARSE) {
            standardOpenOption3 = StandardOpenOption.SPARSE;
            return standardOpenOption3;
        }
        if (d2 == D.SYNC) {
            standardOpenOption2 = StandardOpenOption.SYNC;
            return standardOpenOption2;
        }
        standardOpenOption = StandardOpenOption.DSYNC;
        return standardOpenOption;
    }

    public static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return u.n((Path) obj);
        }
        if (s.m(obj)) {
            return t.n(s.d(obj));
        }
        return obj;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0055e.class;
        }
        if (cls == InterfaceC0055e.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.A.class;
        }
        if (cls == j$.nio.file.attribute.A.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.w.class;
        }
        if (cls == j$.nio.file.attribute.w.class) {
            return j$.adapter.b.B();
        }
        if (cls == C0059i.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return C0059i.class;
        }
        if (cls == j$.nio.file.attribute.D.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.D.class;
        }
        if (cls == C0051a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0051a.class;
        }
        C0096f.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class e(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return InterfaceC0058h.class;
        }
        if (cls == InterfaceC0058h.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.B.class;
        }
        if (cls == j$.nio.file.attribute.B.class) {
            return j$.adapter.b.r();
        }
        if (cls == j$.nio.file.attribute.j.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return j$.nio.file.attribute.j.class;
        }
        C0096f.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map f(Map map) {
        if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                hashMap.put(str, g(map.get(str)));
            }
            return hashMap;
        }
        return map;
    }

    public static Object g(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.nio.file.attribute.p.b(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0096f.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (obj instanceof j$.nio.file.attribute.y) {
            try {
                return j$.nio.file.attribute.p.d((j$.nio.file.attribute.y) obj);
            } catch (ClassCastException e2) {
                C0096f.a("java.nio.file.attribute.FileTime", e2);
                throw null;
            }
        }
        return obj;
    }

    public static Set h(Set set) {
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Object next = set.iterator().next();
            if (next instanceof p) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        hashSet.add(o.a((p) it.next()));
                    } catch (ClassCastException e) {
                        C0096f.a("java.nio.file.OpenOption", e);
                        throw null;
                    }
                }
                return hashSet;
            }
            if (j$.adapter.b.x(next)) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        hashSet.add(n.a(j$.adapter.b.e(it2.next())));
                    } catch (ClassCastException e2) {
                        C0096f.a("java.nio.file.OpenOption", e2);
                        throw null;
                    }
                }
                return hashSet;
            }
            C0096f.a("java.nio.file.OpenOption", next.getClass());
            throw null;
        }
        return set;
    }

    public static Set i(Set set) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        PosixFilePermission posixFilePermission4;
        PosixFilePermission posixFilePermission5;
        PosixFilePermission posixFilePermission6;
        PosixFilePermission posixFilePermission7;
        PosixFilePermission posixFilePermission8;
        j$.nio.file.attribute.C c2;
        PosixFilePermission posixFilePermission9;
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Object next = set.iterator().next();
            if (next instanceof j$.nio.file.attribute.C) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        j$.nio.file.attribute.C c3 = (j$.nio.file.attribute.C) it.next();
                        if (c3 == null) {
                            posixFilePermission9 = null;
                        } else if (c3 == j$.nio.file.attribute.C.OWNER_READ) {
                            posixFilePermission9 = PosixFilePermission.OWNER_READ;
                        } else {
                            posixFilePermission9 = c3 == j$.nio.file.attribute.C.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : c3 == j$.nio.file.attribute.C.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : c3 == j$.nio.file.attribute.C.GROUP_READ ? PosixFilePermission.GROUP_READ : c3 == j$.nio.file.attribute.C.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : c3 == j$.nio.file.attribute.C.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : c3 == j$.nio.file.attribute.C.OTHERS_READ ? PosixFilePermission.OTHERS_READ : c3 == j$.nio.file.attribute.C.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                        }
                        hashSet.add(posixFilePermission9);
                    } catch (ClassCastException e) {
                        C0096f.a("java.nio.file.attribute.PosixFilePermission", e);
                        throw null;
                    }
                }
                return hashSet;
            }
            if (j$.adapter.b.t(next)) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        PosixFilePermission j = j$.adapter.b.j(it2.next());
                        if (j != null) {
                            posixFilePermission = PosixFilePermission.OWNER_READ;
                            if (j != posixFilePermission) {
                                posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
                                if (j != posixFilePermission2) {
                                    posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
                                    if (j != posixFilePermission3) {
                                        posixFilePermission4 = PosixFilePermission.GROUP_READ;
                                        if (j != posixFilePermission4) {
                                            posixFilePermission5 = PosixFilePermission.GROUP_WRITE;
                                            if (j != posixFilePermission5) {
                                                posixFilePermission6 = PosixFilePermission.GROUP_EXECUTE;
                                                if (j != posixFilePermission6) {
                                                    posixFilePermission7 = PosixFilePermission.OTHERS_READ;
                                                    if (j != posixFilePermission7) {
                                                        posixFilePermission8 = PosixFilePermission.OTHERS_WRITE;
                                                        if (j == posixFilePermission8) {
                                                            c2 = j$.nio.file.attribute.C.OTHERS_WRITE;
                                                        } else {
                                                            c2 = j$.nio.file.attribute.C.OTHERS_EXECUTE;
                                                        }
                                                    } else {
                                                        c2 = j$.nio.file.attribute.C.OTHERS_READ;
                                                    }
                                                } else {
                                                    c2 = j$.nio.file.attribute.C.GROUP_EXECUTE;
                                                }
                                            } else {
                                                c2 = j$.nio.file.attribute.C.GROUP_WRITE;
                                            }
                                        } else {
                                            c2 = j$.nio.file.attribute.C.GROUP_READ;
                                        }
                                    } else {
                                        c2 = j$.nio.file.attribute.C.OWNER_EXECUTE;
                                    }
                                } else {
                                    c2 = j$.nio.file.attribute.C.OWNER_WRITE;
                                }
                            } else {
                                c2 = j$.nio.file.attribute.C.OWNER_READ;
                            }
                        } else {
                            c2 = null;
                        }
                        hashSet.add(c2);
                    } catch (ClassCastException e2) {
                        C0096f.a("java.nio.file.attribute.PosixFilePermission", e2);
                        throw null;
                    }
                }
                return hashSet;
            }
            C0096f.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
            throw null;
        }
        return set;
    }

    public static AbstractC0067i j() {
        return AbstractC0069k.a;
    }

    public static /* synthetic */ m[] k(LinkOption[] linkOptionArr) {
        m mVar;
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            if (linkOptionArr[i] == null) {
                mVar = null;
            } else {
                mVar = m.NOFOLLOW_LINKS;
            }
            mVarArr[i] = mVar;
        }
        return mVarArr;
    }

    public static H[] l(WatchEvent.Kind[] kindArr) {
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        WatchEvent.Kind kind4;
        H a2;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        H[] hArr = new H[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind5 = kindArr[i];
            if (kind5 != null) {
                kind = StandardWatchEventKinds.ENTRY_CREATE;
                if (kind5 != kind) {
                    kind2 = StandardWatchEventKinds.ENTRY_DELETE;
                    if (kind5 != kind2) {
                        kind3 = StandardWatchEventKinds.ENTRY_MODIFY;
                        if (kind5 != kind3) {
                            kind4 = StandardWatchEventKinds.OVERFLOW;
                            if (kind5 == kind4) {
                                a2 = a;
                            } else {
                                a2 = F.a(kind5);
                            }
                        } else {
                            a2 = d;
                        }
                    } else {
                        a2 = c;
                    }
                } else {
                    a2 = b;
                }
            } else {
                a2 = null;
            }
            hArr[i] = a2;
        }
        return hArr;
    }

    public static /* synthetic */ LinkOption[] m(m[] mVarArr) {
        LinkOption linkOption;
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            if (mVarArr[i] != null) {
                linkOption = LinkOption.NOFOLLOW_LINKS;
            } else {
                linkOption = null;
            }
            linkOptionArr[i] = linkOption;
        }
        return linkOptionArr;
    }

    public static WatchEvent.Kind[] n(H[] hArr) {
        WatchEvent.Kind a2;
        if (hArr == null) {
            return null;
        }
        int length = hArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            H h = hArr[i];
            if (h == null) {
                a2 = null;
            } else if (h == b) {
                a2 = StandardWatchEventKinds.ENTRY_CREATE;
            } else {
                a2 = h == c ? StandardWatchEventKinds.ENTRY_DELETE : h == d ? StandardWatchEventKinds.ENTRY_MODIFY : h == a ? StandardWatchEventKinds.OVERFLOW : G.a(h);
            }
            kindArr[i] = a2;
        }
        return kindArr;
    }
}
