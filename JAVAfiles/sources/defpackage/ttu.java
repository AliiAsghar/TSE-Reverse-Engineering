package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ttu implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ ttu(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return pvz.a((ChatMessage) obj);
            case 1:
                throw new wyz((IllegalStateException) obj);
            case 2:
                throw new wyz((IllegalStateException) obj);
            case 3:
                return pvz.a((ChatMessage) obj);
            case 4:
                throw new wyz((IllegalStateException) obj);
            case 5:
                return pvz.a((ChatMessage) obj);
            case 6:
                throw new wyz((IllegalStateException) obj);
            case 7:
                alhr alhrVar = tuc.a;
                return apwq.a;
            case 8:
                return tuc.e((twg) obj);
            case 9:
                return tuc.e((aqwb) obj);
            case 10:
                return tuc.e((tvi) obj);
            case 11:
                alhr alhrVar2 = tuc.a;
                return apwq.a;
            case 12:
                return apwq.a;
            case 13:
                return tva.f((gvf) obj);
            case 14:
                return tva.f((gvf) obj);
            case 15:
                tvg.a.r("Group retry message gets into an invalid state.", (twx) obj);
                return ubh.d(pwh.FAIL_NO_RETRY);
            case 16:
                tvg.g((IllegalStateException) obj);
                return tvx.b(ttf.ENCRYPTOR_NOT_FOUND);
            case 17:
                tvg.g((twg) obj);
                return tvx.b(ttf.ENCRYPTOR_NOT_FOUND);
            case 18:
                tvg.a.r("Group retry message gets into an invalid state.", (twx) obj);
                return pwh.FAIL_NO_RETRY;
            case 19:
                xyo e = tvg.a.e();
                e.H("Unable to parse the incoming chat message content as a MessageEnvelope.");
                e.z("errorMessage", ((apba) obj).getMessage());
                e.q();
                return tvx.b(ttf.INVALID_PROTOCOL_BUFFER);
            default:
                xyo e2 = tvg.a.e();
                e2.H("Incoming chat message is not base 64 encoded.");
                e2.z("errorMessage", ((IllegalArgumentException) obj).getMessage());
                e2.q();
                return tvx.b(ttf.INVALID_PROTOCOL_BUFFER);
        }
    }
}
