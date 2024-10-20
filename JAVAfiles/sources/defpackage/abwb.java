package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwb implements Closeable {
    public final abwd a;
    public volatile IDroidGuardHandle b;
    public volatile byte[] c;
    private final Context d;
    private final long e;
    private final abwn f;

    public abwb(Context context, abwd abwdVar, IDroidGuardHandle iDroidGuardHandle, long j, abwn abwnVar) {
        this.d = context;
        this.a = abwdVar;
        this.b = iDroidGuardHandle;
        this.e = j;
        this.f = abwnVar;
    }

    public final String a(Map map) {
        byte[] g;
        UUID fromString;
        abwn clone = this.f.clone();
        clone.c(14, abwm.COARSE);
        if (this.c != null) {
            g = this.c;
        } else {
            abwl abwlVar = new abwl();
            this.a.d(new aauq(this, map, abwlVar, 9, (char[]) null));
            try {
                g = (byte[]) abwlVar.a(this.e);
                if (g == null) {
                    g = abhx.f("Snapshot timeout: " + this.e + " ms");
                }
            } catch (InterruptedException e) {
                g = abhx.g("Results transfer failed: ".concat(e.toString()), e);
            }
        }
        clone.c(15, abwm.COARSE);
        Context context = this.d;
        alcj b = clone.b();
        aozy createBuilder = alck.a.createBuilder();
        aozb w = aozb.w(g);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        alck alckVar = (alck) apagVar;
        alckVar.b |= 2;
        alckVar.d = w;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        alck alckVar2 = (alck) createBuilder.b;
        b.getClass();
        alckVar2.e = b;
        alckVar2.b |= 4;
        alch alchVar = alch.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alck alckVar3 = (alck) createBuilder.b;
        alchVar.getClass();
        alckVar3.f = alchVar;
        alckVar3.b |= 8;
        SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
        String string = sharedPreferences.getString("client_uuid", "");
        if (string.isEmpty()) {
            fromString = UUID.randomUUID();
            sharedPreferences.edit().putString("client_uuid", fromString.toString()).apply();
        } else {
            fromString = UUID.fromString(string);
        }
        aozb w2 = aozb.w(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alck alckVar4 = (alck) createBuilder.b;
        alckVar4.b = 16 | alckVar4.b;
        alckVar4.g = w2;
        alck alckVar5 = (alck) createBuilder.s();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (bArr[2] ^ ((byte) i));
            byteArrayOutputStream.write(bArr);
            aozy builder = alckVar5.toBuilder();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            alck alckVar6 = (alck) builder.b;
            alckVar6.b &= -2;
            alckVar6.c = alck.a.c;
            ((alck) builder.s()).writeTo(byteArrayOutputStream);
            return abhx.e(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(new aaxu(this, 20));
    }

    public abwb(Context context, abwd abwdVar, String str, abwn abwnVar) {
        this.d = context;
        this.a = abwdVar;
        this.f = abwnVar;
        this.c = abhx.f(str);
        this.e = 0L;
    }

    public abwb(Context context, abwd abwdVar, String str, abwn abwnVar, Throwable th) {
        this.d = context;
        this.a = abwdVar;
        this.f = abwnVar;
        this.c = abhx.g(str, th);
        this.e = 0L;
    }
}
