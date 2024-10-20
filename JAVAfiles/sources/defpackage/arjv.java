package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjv {
    public boolean a;
    public Object b;
    public Object c;

    public arjv() {
    }

    public final void a(arju... arjuVarArr) {
        String[] strArr = new String[arjuVarArr.length];
        for (int i = 0; i < arjuVarArr.length; i++) {
            strArr[i] = arjuVarArr[i].bb;
        }
        this.b = strArr;
    }

    public final void b() {
        this.a = true;
    }

    public final void c(arkf... arkfVarArr) {
        String[] strArr = new String[arkfVarArr.length];
        for (int i = 0; i < arkfVarArr.length; i++) {
            strArr[i] = arkfVarArr[i].f;
        }
        this.c = strArr;
    }

    public arjv(arjw arjwVar) {
        boolean z = arjwVar.b;
        this.b = arjwVar.c;
        this.c = arjwVar.d;
        this.a = arjwVar.e;
    }
}
