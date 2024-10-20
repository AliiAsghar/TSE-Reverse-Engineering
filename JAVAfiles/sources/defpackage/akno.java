package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akno {
    public static final akno a = new akno(new asqe((byte[]) null));
    public final alog b;
    public final alog c;
    private final String d;

    private akno(asqe asqeVar) {
        this.d = (String) asqeVar.c;
        this.b = ((alob) asqeVar.a).g();
        this.c = ((alob) asqeVar.b).g();
    }

    public final String toString() {
        return this.d + "@" + Integer.toHexString(hashCode());
    }
}
