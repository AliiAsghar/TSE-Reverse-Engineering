package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vjn extends unp {
    public static final alwo a = alwo.o("BugleNotifications");
    public final armf b;
    public final armf c;
    private final anen d;

    public vjn(armf armfVar, armf armfVar2, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MarkFailuresAsNotifiedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        return aktp.ai(new ulo(this, (vjp) apbtVar, 18), this.d);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vjp.a.getParserForType();
    }
}
