package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwc extends arpa implements aryk {
    public static final akty b = new akty();
    public final long a;

    public arwc(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ Object a(arpi arpiVar) {
        String str;
        arwd arwdVar = (arwd) arpiVar.get(arwd.b);
        if (arwdVar != null) {
            str = arwdVar.a;
        } else {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int ai = arsd.ai(name, " @");
        if (ai < 0) {
            ai = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + ai + 10);
        String substring = name.substring(0, ai);
        substring.getClass();
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        currentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ void b(arpi arpiVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof arwc) && this.a == ((arwc) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
