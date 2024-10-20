package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzp extends Exception {
    public abzp(String str) {
        super(String.format("Protocol version %s not supported", str));
    }
}
