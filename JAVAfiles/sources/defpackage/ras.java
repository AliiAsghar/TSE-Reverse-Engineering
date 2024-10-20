package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ras extends arpw implements arqv {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ras(arxm arxmVar, int i, int i2, hdr hdrVar, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.f = i3;
        this.e = arxmVar;
        this.c = i;
        this.b = i2;
        this.d = hdrVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((ras) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((ras) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((ras) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((ras) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ras.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new ras((wzi) this.e, (MessageCoreData) this.d, this.b, this.c, arpeVar, 3);
                }
                Object obj2 = this.d;
                return new ras((uac) obj2, this.c, (Instant) this.e, this.b, arpeVar, 2);
            }
            return new ras((arxm) this.e, this.c, this.b, (hdr) this.d, arpeVar, 1);
        }
        return new ras((rat) this.d, (MessageCoreData) this.e, this.b, this.c, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ras(rat ratVar, MessageCoreData messageCoreData, int i, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.f = i3;
        this.d = ratVar;
        this.e = messageCoreData;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ras(uac uacVar, int i, Instant instant, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.f = i3;
        this.d = uacVar;
        this.c = i;
        this.e = instant;
        this.b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ras(wzi wziVar, MessageCoreData messageCoreData, int i, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.f = i3;
        this.e = wziVar;
        this.d = messageCoreData;
        this.b = i;
        this.c = i2;
    }
}
