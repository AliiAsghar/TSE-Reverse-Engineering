package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache");
    public final jzu b;
    public final arpi c;
    public final jzq d;
    public HashSet e;
    public HashSet f;
    private final arwe g;

    public jzr(jzu jzuVar, arwe arweVar, arpi arpiVar, Optional optional) {
        int i;
        jzuVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        this.b = jzuVar;
        this.g = arweVar;
        this.c = arweVar.b();
        jzs jzsVar = (jzs) arsd.k(optional);
        if (jzsVar != null) {
            i = jzsVar.a();
        } else {
            i = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        this.d = new jzq(i, new ifp((Object) this, 7, (byte[][]) null));
        this.e = new HashSet();
        this.f = new HashSet();
    }
}
