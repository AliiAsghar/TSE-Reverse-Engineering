package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alf {
    public final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a("Visible", 0);
            a = aVar;
            a aVar2 = new a("Clip", 1);
            b = aVar2;
            a aVar3 = new a("ExpandIndicator", 2);
            c = aVar3;
            a aVar4 = new a("ExpandOrCollapseIndicator", 3);
            d = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            e = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public alf(a aVar) {
        this.a = aVar;
    }
}
