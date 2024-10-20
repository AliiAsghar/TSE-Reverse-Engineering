package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aozz extends aoyl {
    private final apag a;

    public aozz(apag apagVar) {
        this.a = apagVar;
    }

    @Override // defpackage.aoyl
    public final /* bridge */ /* synthetic */ apbt c(byte[] bArr, int i, int i2, aozs aozsVar) {
        apag parsePartialFrom;
        parsePartialFrom = apag.parsePartialFrom(this.a, bArr, i, i2, aozsVar);
        return parsePartialFrom;
    }

    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object j(aozg aozgVar, aozs aozsVar) {
        return apag.parsePartialFrom(this.a, aozgVar, aozsVar);
    }
}
