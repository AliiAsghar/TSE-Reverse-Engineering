package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambx extends amaz implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public ambx(String str, int i, String str2) {
        this.d = str2;
        MessageDigest h = h(str);
        this.a = h;
        int digestLength = h.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        albo.O(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = i(h);
    }

    private static MessageDigest h(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean i(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ambk
    public final ambl f() {
        if (this.c) {
            try {
                return new ambv((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new ambv(h(this.a.getAlgorithm()), this.b);
    }

    @Override // defpackage.ambk
    public final int g() {
        return this.b * 8;
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new ambw(this.a.getAlgorithm(), this.b, this.d);
    }

    public ambx(String str, String str2) {
        MessageDigest h = h(str);
        this.a = h;
        this.b = h.getDigestLength();
        this.d = str2;
        this.c = i(h);
    }
}
