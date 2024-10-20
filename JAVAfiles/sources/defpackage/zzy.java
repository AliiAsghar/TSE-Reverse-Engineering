package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzy extends arpw implements arqv {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(arpe arpeVar, int i) {
        super(2, arpeVar);
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new zzy((arpe) obj2, 4, (int[]) null).b(arnb.a);
                    }
                    return new zzy((arpe) obj2, 3, (short[]) null).b(arnb.a);
                }
                return new zzy((arpe) obj2, 2, (char[]) null).b(arnb.a);
            }
            return new zzy((arpe) obj2, 1, (byte[]) null).b(arnb.a);
        }
        return new zzy((arpe) obj2, 0).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        aqil.P(obj);
                        return new MediaPlayer();
                    }
                    aqil.P(obj);
                    return akna.b();
                }
                aqil.P(obj);
                return akna.b();
            }
            aqil.P(obj);
            alvw g = zzz.a.g();
            g.X(alwp.a, "BugleCdp");
            ((alvg) g.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl$internalCreateUiData$8", "invokeSuspend", 133, "ConversationDetailsUiAdapterImpl.kt")).q("Collected HeaderUiData");
            return arnb.a;
        }
        aqil.P(obj);
        alvw g2 = zzz.a.g();
        g2.X(alwp.a, "BugleCdp");
        ((alvg) g2.h("com/google/android/apps/messaging/ui/conversation/details/screen/ConversationDetailsUiAdapterImpl$internalCreateUiData$9", "invokeSuspend", 137, "ConversationDetailsUiAdapterImpl.kt")).q("ConversationDetailsUiAdapter collected EncryptionUiData");
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new zzy(arpeVar, 4, (int[]) null);
                    }
                    return new zzy(arpeVar, 3, (short[]) null);
                }
                return new zzy(arpeVar, 2, (char[]) null);
            }
            return new zzy(arpeVar, 1, (byte[]) null);
        }
        return new zzy(arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(arpe arpeVar, int i, int[] iArr) {
        super(2, arpeVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(arpe arpeVar, int i, short[] sArr) {
        super(2, arpeVar);
        this.a = i;
    }
}
