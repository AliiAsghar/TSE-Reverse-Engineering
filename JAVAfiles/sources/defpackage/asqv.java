package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface asqv extends WritableByteChannel, asro {
    void J(asqx asqxVar);

    void N(int i);

    void P(int i);

    void Q(int i);

    void U(byte[] bArr);

    void X(byte[] bArr);

    void Z(String str);

    @Override // defpackage.asro, java.io.Flushable
    void flush();

    asqu q();

    asqv r(long j);
}
