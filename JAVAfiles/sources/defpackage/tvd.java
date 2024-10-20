package defpackage;

import com.google.media.webrtc.common.StatusOr;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvd implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ tvd(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = true;
        typ typVar = null;
        switch (this.a) {
            case 0:
                return ubh.d((pwh) obj);
            case 1:
                return pwh.SUCCESS;
            case 2:
                xyo e = tvg.a.e();
                e.H("Unable to parse the incoming chat message content as a MessageEnvelope.");
                e.z("errorMessage", ((apba) obj).getMessage());
                e.q();
                return tvx.b(ttf.INVALID_PROTOCOL_BUFFER);
            case 3:
                tvg.g((IllegalStateException) obj);
                return tvx.b(ttf.ENCRYPTOR_NOT_FOUND);
            case 4:
                return (TachyonCommon$PublicPreKeySets) twd.a((StatusOr) obj);
            case 5:
                return (Boolean) twd.a((StatusOr) obj);
            case 6:
                return Optional.of((TachyonCommon$PublicPreKeySets) obj);
            case 7:
                tvl.a.r("Failed to generate prekey set.", (Throwable) obj);
                return Optional.empty();
            case 8:
                if (((ved) obj) == ved.REGISTERED_WITH_PREKEYS) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return new gsw();
            case 10:
                return new gsu();
            case 11:
                twf.a.r("Failed to set prekeys:", (Throwable) obj);
                return new gsu();
            case 12:
                return ((vbq) obj).m();
            case 13:
                return Status.b;
            case 14:
                return Status.c((Throwable) obj);
            case 15:
                return upm.b();
            case 16:
                tww.D.r("Failed to delete outdated otks.", (aqwb) obj);
                return upm.d();
            case 17:
                return null;
            case 18:
                int i = ((tyq) obj).b;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                typVar = typ.NOT_PROVISIONED_BUT_INITIALIZED;
                            }
                        } else {
                            typVar = typ.NOT_PROVISIONED;
                        }
                    } else {
                        typVar = typ.PROVISIONED;
                    }
                } else {
                    typVar = typ.UNSET;
                }
                if (typVar == null) {
                    return typ.UNRECOGNIZED;
                }
                return typVar;
            case 19:
                return Boolean.valueOf(((ual) obj).d);
            default:
                return Boolean.valueOf(((ual) obj).c);
        }
    }
}
