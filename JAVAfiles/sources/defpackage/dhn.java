package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhn<T> {
    public final String a;
    public final arqv b;
    public boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dhn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<T, T, T> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final Object a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2;
            }
            return obj;
        }
    }

    public dhn(String str, arqv arqvVar) {
        this.a = str;
        this.b = arqvVar;
    }

    public final void a(dho dhoVar, Object obj) {
        dhoVar.c(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ dhn(String str) {
        this(str, AnonymousClass1.a);
    }

    public dhn(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public dhn(String str, boolean z, arqv arqvVar) {
        this(str, arqvVar);
        this.c = z;
    }
}
