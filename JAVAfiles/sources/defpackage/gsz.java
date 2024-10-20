package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsz extends gtn {
    public gsz(Class cls) {
        super(cls);
    }

    @Override // defpackage.gtn
    public final /* bridge */ /* synthetic */ kkc a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new kkc(this);
    }
}
