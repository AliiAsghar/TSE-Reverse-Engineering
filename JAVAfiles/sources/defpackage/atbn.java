package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbn implements PrivateKey, Key {
    private static final long serialVersionUID = 1;
    private transient aswo a;
    private transient String b;
    private transient byte[] c;
    private transient ASN1Set d;

    public atbn(PrivateKeyInfo privateKeyInfo) {
        a(privateKeyInfo);
    }

    private final void a(PrivateKeyInfo privateKeyInfo) {
        aswo aswoVar = (aswo) atow.au(privateKeyInfo);
        this.d = privateKeyInfo.b;
        this.a = aswoVar;
        this.b = atdg.c(aswoVar.b.e);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a(PrivateKeyInfo.b((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atbn) {
            return Arrays.equals(getEncoded(), ((atbn) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.c == null) {
            this.c = atow.ac(this.a, this.d);
        }
        return atow.O(this.c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return atow.M(getEncoded());
    }
}
