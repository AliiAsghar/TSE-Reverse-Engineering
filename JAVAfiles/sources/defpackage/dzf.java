package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        Notification.MessagingStyle groupConversation;
        groupConversation = messagingStyle.setGroupConversation(z);
        return groupConversation;
    }

    public static ebi c(Configuration configuration) {
        LocaleList locales;
        locales = configuration.getLocales();
        return ebi.d(locales);
    }

    public static boolean d(esp espVar) {
        if (espVar.b == -1 || espVar.c == -1) {
            return false;
        }
        int i = espVar.d;
        if (i != 2 && i != 4) {
            return false;
        }
        return true;
    }

    public static void e(ByteBuffer byteBuffer, esp espVar, ByteBuffer byteBuffer2, esp espVar2, esu esuVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        ByteBuffer byteBuffer3;
        int i2 = espVar.d;
        int i3 = espVar2.d;
        int i4 = esuVar.a;
        float[] fArr = new float[i4];
        int i5 = esuVar.b;
        float[] fArr2 = new float[i5];
        for (int i6 = 0; i6 < i; i6++) {
            if (i3 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                int position = byteBuffer2.position();
                for (int i7 = 0; i7 < i5; i7++) {
                    fArr2[i7] = i(byteBuffer2, z2, z2);
                }
                byteBuffer2.position(position);
            }
            for (int i8 = 0; i8 < i4; i8++) {
                if (i2 == 2) {
                    byteBuffer3 = byteBuffer;
                    z3 = true;
                } else {
                    z3 = false;
                    byteBuffer3 = byteBuffer;
                }
                fArr[i8] = i(byteBuffer3, z3, z2);
            }
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i4; i10++) {
                    fArr2[i9] = fArr2[i9] + (fArr[i10] * esuVar.a(i10, i9));
                }
                if (z2) {
                    byteBuffer2.putShort((short) eul.a(fArr2[i9], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(eul.a(fArr2[i9], -1.0f, 1.0f));
                }
                fArr2[i9] = 0.0f;
            }
        }
    }

    public static final erp f(apvo apvoVar) {
        return new erp(apvoVar.b());
    }

    public static final void g(erp erpVar, apvo apvoVar) {
        int i = erp.b;
        eql eqlVar = erpVar.a;
        for (int i2 = 0; i2 < eqlVar.b(); i2++) {
            apvoVar.c(eqlVar.a(i2));
        }
    }

    public static final void h(int i, boolean z, apvo apvoVar) {
        if (z) {
            apvoVar.c(i);
        }
    }

    private static float i(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i = 32768;
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            if (f >= brg.a) {
                i = 32767;
            }
            return eul.a(f * i, -32768.0f, 32767.0f);
        }
        if (z) {
            short s = byteBuffer.getShort();
            float f2 = s;
            if (s >= 0) {
                i = 32767;
            }
            return f2 / i;
        }
        return byteBuffer.getFloat();
    }
}
