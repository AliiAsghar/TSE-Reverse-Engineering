package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiof {
    private static final byte[] a = ainf.a;
    private static final int b = ainf.a.length;

    public static ainh a(InputStream inputStream) {
        ainh ainjVar;
        int i;
        if (inputStream.markSupported()) {
            String ai = agkx.ai(inputStream);
            if (ai.length() == 0) {
                if (inputStream.available() == 0) {
                    return new ainf();
                }
                int i2 = b;
                inputStream.mark(i2);
                byte[] bArr = new byte[i2];
                inputStream.read(bArr, 0, i2);
                if (Arrays.equals(bArr, a)) {
                    return new aine();
                }
                inputStream.reset();
                return new ainf();
            }
            if (!ai.startsWith("SIP/2.0")) {
                ailc ailcVar = new ailc(ai.concat("\n"), (char[]) null);
                String b2 = ailcVar.b();
                ailcVar.a.h();
                ailcVar.a.n("sip_urlLexer");
                aiks n = new ailc(ailcVar.a, (char[]) null).n();
                ailcVar.a.h();
                ailcVar.a.n("request_lineLexer");
                ailcVar.p();
                ailcVar.a.h();
                ailcVar.a.a(10);
                ainjVar = new aini(new aims(b2, n));
            } else {
                ailc ailcVar2 = new ailc(ai.concat("\n"), (short[]) null);
                ailcVar2.p();
                ailcVar2.a.h();
                try {
                    int parseInt = Integer.parseInt(ailcVar2.a.d());
                    ailcVar2.a.h();
                    String c = ailcVar2.a.c();
                    if (c != null) {
                        String trim = c.trim();
                        ailcVar2.a.h();
                        ainjVar = new ainj(new aimx(parseInt, trim));
                    } else {
                        throw new ailb("Rest is null");
                    }
                } catch (NumberFormatException e) {
                    String str = ailcVar2.a.f + ":" + e.getMessage();
                    int i3 = ailcVar2.a.g;
                    throw new ailb(str);
                }
            }
            String ai2 = agkx.ai(inputStream);
            while (ai2.trim().length() > 0) {
                ailc a2 = ainx.a(ai2.concat("\n"));
                if (a2 != null) {
                    try {
                        ainjVar.k(a2.h());
                        ai2 = agkx.ai(inputStream);
                    } catch (IllegalArgumentException | StringIndexOutOfBoundsException e2) {
                        throw new ailb("Unable to parse SIP header:".concat(String.valueOf(e2.getMessage())));
                    }
                } else {
                    throw new ailb("Header Parser is null");
                }
            }
            aima aimaVar = ainjVar.i;
            if (aimaVar != null && (i = aimaVar.a) > 0) {
                byte[] bArr2 = new byte[i];
                int read = inputStream.read(bArr2);
                while (read < i) {
                    try {
                        read += inputStream.read(bArr2, read, i - read);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new ailb(String.format("At byte:[%d] of [%d] Unable to read content from SIP message: %s", Integer.valueOf(read), Integer.valueOf(i), e3.getMessage()));
                    }
                }
                ainjVar.n(bArr2);
            }
            return ainjVar;
        }
        throw new IOException("SipMessageParser requires markable streams");
    }
}
