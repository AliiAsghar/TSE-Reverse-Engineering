package defpackage;

import com.google.communication.synapse.security.scytale.DecryptState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class txi extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        txm txmVar = (txm) obj;
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        int ordinal = txmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(txmVar.toString()));
                            }
                            throw new IllegalArgumentException("Unrecognized DecryptState.");
                        }
                        return DecryptState.SUCCESS;
                    }
                    return DecryptState.FAIL_TO_DECRYPT;
                }
                return DecryptState.UNTRUSTED_USER_ID;
            }
            return DecryptState.UNTRUSTED_IDENTITY_KEY;
        }
        throw new IllegalArgumentException("Unknown DecryptState.");
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        DecryptState decryptState = (DecryptState) obj;
        int ordinal = decryptState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return txm.DECRYPT_SUCCESS;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(decryptState.toString()));
                }
                return txm.FAIL_TO_DECRYPT;
            }
            return txm.UNTRUSTED_USER_ID;
        }
        return txm.UNTRUSTED_IDENTITY_KEY;
    }
}
