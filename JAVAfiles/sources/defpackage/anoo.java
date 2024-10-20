package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anoo implements anmr {
    public static final /* synthetic */ int a = 0;
    private static final Set b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public anoo(anxg anxgVar) {
        if (b.contains(anxgVar.b)) {
            String str = anxgVar.b;
            aozy createBuilder = anxg.a.createBuilder(anxgVar);
            anxp anxpVar = anxp.RAW;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anxg) createBuilder.b).d = anxpVar.a();
            anme.o(((anxg) createBuilder.s()).toByteArray());
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + anxgVar.b + ". Only Tink AEAD key types are supported.");
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
