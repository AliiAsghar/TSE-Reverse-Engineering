package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import java.io.Closeable;
import java.util.Stack;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ued implements uco {
    public static final utz a = uuh.q(173131903);
    static final ThreadLocal b = new ThreadLocal();
    public final uec c;
    public StrictMode.ThreadPolicy d;
    private int e;

    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    public ued(uli uliVar) {
        if (yhx.b) {
            ThreadLocal threadLocal = b;
            ((udg) uliVar.a.b()).getClass();
            threadLocal.getClass();
            this.c = new udi(threadLocal);
            return;
        }
        this.c = new udj();
    }

    public static void h() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new Stack());
        }
    }

    static final wpp j() {
        h();
        Stack stack = (Stack) b.get();
        if (stack.empty()) {
            return null;
        }
        return (wpp) stack.peek();
    }

    private final void k() {
        wpp wppVar;
        h();
        Stack stack = (Stack) b.get();
        if (stack.isEmpty()) {
            wppVar = null;
        } else {
            wppVar = (wpp) stack.firstElement();
        }
        if (wppVar != null) {
            int i = this.e;
            this.e = i + 1;
            if (i == 0) {
                Object obj = wppVar.c;
                obj.getClass();
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) obj);
            }
        }
    }

    @Override // defpackage.uco
    public final Cursor a(Cursor cursor, ude udeVar) {
        return new ueb(this, cursor);
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    public final Object f(Supplier supplier) {
        Object obj;
        k();
        try {
            obj = supplier.get();
            return obj;
        } finally {
            g();
        }
    }

    public final void g() {
        if (this.d != null && j() != null) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                StrictMode.ThreadPolicy threadPolicy = this.d;
                threadPolicy.getClass();
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    public final void i(Runnable runnable) {
        k();
        try {
            runnable.run();
        } finally {
            g();
        }
    }

    @Override // defpackage.uco
    public final Closeable l(final ude udeVar) {
        if (((Boolean) a.e()).booleanValue()) {
            int ordinal = udeVar.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 12) {
                    switch (ordinal) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                            wpp j = j();
                            final boolean z = true;
                            boolean z2 = false;
                            if (j != null && !((uci) j.b).f.b.equals(((uci) udeVar.d).f.b)) {
                                z2 = true;
                            }
                            if (j != null) {
                                if (!z2) {
                                    return null;
                                }
                            } else {
                                z = z2;
                            }
                            if (z) {
                                k();
                            }
                            return new Closeable() { // from class: udy
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    wpp wppVar = new wpp(udeVar.d);
                                    ued.h();
                                    ((Stack) ued.b.get()).push(wppVar);
                                    ued uedVar = ued.this;
                                    if (uedVar.d == null) {
                                        uedVar.d = uedVar.c.a();
                                    }
                                    boolean z3 = z;
                                    StrictMode.setThreadPolicy(uedVar.d);
                                    if (z3) {
                                        uedVar.g();
                                    }
                                }
                            };
                        case 8:
                        case 9:
                            wpp j2 = j();
                            if (j2 != null) {
                                Object obj = j2.c;
                                obj.getClass();
                                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) obj);
                            }
                            h();
                            Stack stack = (Stack) b.get();
                            if (!stack.isEmpty()) {
                                stack.pop();
                            }
                            k();
                            return new ucz(this, 6);
                        default:
                            return null;
                    }
                } else {
                    k();
                    return new ucz(this, 7);
                }
            }
            k();
            return new ucz(this, 7);
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        if (!((Boolean) a.e()).booleanValue() || xyp.a()) {
            return false;
        }
        if ((!xyp.j() || xyp.b() || xyp.f() || xyp.i()) && !xyp.c()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
