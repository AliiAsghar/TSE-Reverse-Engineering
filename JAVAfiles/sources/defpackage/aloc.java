package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aloc extends alur {
    private final alog a;

    public aloc(alog alogVar, int i) {
        super(alogVar.size(), i);
        this.a = alogVar;
    }

    @Override // defpackage.alur
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
