package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gih implements gki, gkh {
    public static final TreeMap a = new TreeMap();
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    private final int f;
    private volatile String g;
    private final int[] h;
    private int i;

    public gih(int i) {
        this.f = i;
        int i2 = i + 1;
        this.h = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2];
    }

    public static final gih a(String str, int i) {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                gih gihVar = (gih) ceilingEntry.getValue();
                gihVar.i(str, i);
                gihVar.getClass();
                return gihVar;
            }
            gih gihVar2 = new gih(i);
            gihVar2.i(str, i);
            return gihVar2;
        }
    }

    @Override // defpackage.gki
    public final String b() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.gkh
    public final void c(int i, byte[] bArr) {
        throw null;
    }

    @Override // defpackage.gkh
    public final void d(int i, double d) {
        throw null;
    }

    @Override // defpackage.gkh
    public final void e(int i, long j) {
        this.h[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.gkh
    public final void f(int i) {
        throw null;
    }

    @Override // defpackage.gkh
    public final void g(int i, String str) {
        str.getClass();
        this.h[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.gki
    public final void h(gkh gkhVar) {
        int i = this.i;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                int i3 = this.h[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    byte[] bArr = this.e[i2];
                                    if (bArr != null) {
                                        gkhVar.c(i2, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                String str = this.d[i2];
                                if (str != null) {
                                    gkhVar.g(i2, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            gkhVar.d(i2, this.c[i2]);
                        }
                    } else {
                        gkhVar.e(i2, this.b[i2]);
                    }
                } else {
                    gkhVar.f(i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i(String str, int i) {
        this.g = str;
        this.i = i;
    }

    public final void j() {
        TreeMap treeMap = a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f), this);
            if (treeMap.size() > 15) {
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                for (int size = treeMap.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
