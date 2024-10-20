package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface clr {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("CounterClockwise", 0);
            a = aVar;
            a aVar2 = new a("Clockwise", 1);
            b = aVar2;
            a[] aVarArr = {aVar, aVar2};
            c = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    int a();

    cjp b();

    void c();

    void d(float f, float f2, float f3, float f4, float f5, float f6);

    void e(float f, float f2);

    void f(float f, float f2);

    void g(float f, float f2, float f3, float f4);

    void h(float f, float f2, float f3, float f4, float f5, float f6);

    void i(float f, float f2);

    void j(float f, float f2, float f3, float f4);

    void k();

    void l();

    void m(int i);

    void n(long j);

    boolean o();

    void p(clr clrVar, clr clrVar2, int i);
}
