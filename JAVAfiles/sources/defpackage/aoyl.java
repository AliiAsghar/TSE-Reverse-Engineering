package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aoyl implements apca {
    private static final aozs a;

    static {
        aozs aozsVar = aozs.a;
        apcc apccVar = apcc.a;
        a = aozs.a;
    }

    private static final void k(apbt apbtVar) {
        if (apbtVar != null && !apbtVar.isInitialized()) {
            throw ((aoyj) apbtVar).newUninitializedMessageException().a();
        }
    }

    @Override // defpackage.apca
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apbt h(byte[] bArr, aozs aozsVar) {
        return b(bArr, 0, bArr.length, aozsVar);
    }

    public final apbt b(byte[] bArr, int i, int i2, aozs aozsVar) {
        apbt c = c(bArr, i, i2, aozsVar);
        k(c);
        return c;
    }

    public apbt c(byte[] bArr, int i, int i2, aozs aozsVar) {
        throw null;
    }

    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object d(byte[] bArr) {
        return h(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, apbt] */
    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object e(aozb aozbVar, aozs aozsVar) {
        aozg l = aozbVar.l();
        ?? j = j(l, aozsVar);
        l.z(0);
        k(j);
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, apbt] */
    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object f(aozg aozgVar, aozs aozsVar) {
        ?? j = j(aozgVar, aozsVar);
        k(j);
        return j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, apbt] */
    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream, aozs aozsVar) {
        aozg J = aozg.J(inputStream);
        ?? j = j(J, aozsVar);
        J.z(0);
        k(j);
        return j;
    }

    @Override // defpackage.apca
    public final /* bridge */ /* synthetic */ Object i(byte[] bArr, int i, aozs aozsVar) {
        return b(bArr, 1, i, aozsVar);
    }
}
