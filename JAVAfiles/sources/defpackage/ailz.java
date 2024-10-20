package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailz extends aimh implements Cloneable {
    private final String a;

    public ailz(String str) {
        super("Content-ID");
        this.a = str;
    }

    @Override // defpackage.aimh
    public final String a() {
        return String.format("<%s>", this.a);
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        return new ailz(this.a);
    }

    @Override // defpackage.aimh
    public final aila d() {
        return new aila();
    }
}
