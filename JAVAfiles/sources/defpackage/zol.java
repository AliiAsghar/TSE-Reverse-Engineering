package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.stream.IntStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zol extends hb {
    private final zos a;
    private final zos b;

    public zol(zos zosVar, zos zosVar2) {
        this.a = zosVar;
        this.b = zosVar2;
    }

    public static final boolean f(MessagePartCoreData messagePartCoreData, MessagePartCoreData messagePartCoreData2) {
        return messagePartCoreData.bD(messagePartCoreData2);
    }

    private static final boolean g(int i, zos zosVar) {
        if (i == zosVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hb
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hb
    public final int b() {
        return this.a.a();
    }

    @Override // defpackage.hb
    public final boolean d(int i, int i2) {
        zos zosVar = this.b;
        boolean g = g(i, this.a);
        boolean g2 = g(i2, zosVar);
        if (g) {
            if (g2) {
                zos zosVar2 = this.a;
                zos zosVar3 = this.b;
                alog alogVar = zosVar2.b;
                int i3 = ((alsx) alogVar).c;
                alog alogVar2 = zosVar3.b;
                if (i3 != ((alsx) alogVar2).c || zosVar2.d != zosVar3.d) {
                    return false;
                }
                return IntStream.CC.range(0, i3).allMatch(new zok(alogVar, alogVar2, 0));
            }
            g2 = false;
        }
        if (!g && !g2) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.a.get(Integer.valueOf(i));
            messagePartCoreData.getClass();
            MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) this.b.a.get(Integer.valueOf(i2));
            messagePartCoreData2.getClass();
            if ((messagePartCoreData instanceof PendingAttachmentData) == (messagePartCoreData2 instanceof PendingAttachmentData)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hb
    public final boolean e(int i, int i2) {
        zos zosVar = this.b;
        boolean g = g(i, this.a);
        boolean g2 = g(i2, zosVar);
        if (g) {
            if (!g2) {
                g2 = false;
            } else {
                return Collection.EL.stream(this.a.b).anyMatch(new zko(this.b.b, 2));
            }
        }
        if (g || g2) {
            return false;
        }
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.a.get(Integer.valueOf(i));
        messagePartCoreData.getClass();
        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) this.b.a.get(Integer.valueOf(i2));
        messagePartCoreData2.getClass();
        return f(messagePartCoreData, messagePartCoreData2);
    }
}
