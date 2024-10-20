package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdq implements algk {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdq(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                int i = mdt.d;
                aozy builder = ((mdn) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                long j = this.a;
                mdn mdnVar = (mdn) builder.b;
                mdnVar.b |= 64;
                mdnVar.i = j;
                return (mdn) builder.s();
            case 1:
                int i2 = mdt.d;
                aozy builder2 = ((mdn) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                long j2 = this.a;
                mdn mdnVar2 = (mdn) builder2.b;
                mdnVar2.b |= 8;
                mdnVar2.f = j2;
                return (mdn) builder2.s();
            case 2:
                int i3 = mdt.d;
                aozy builder3 = ((mdn) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                long j3 = this.a;
                mdn mdnVar3 = (mdn) builder3.b;
                mdnVar3.b |= 4096;
                mdnVar3.n = j3;
                return (mdn) builder3.s();
            case 3:
                int i4 = mdt.d;
                aozy builder4 = ((mdn) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                long j4 = this.a;
                mdn mdnVar4 = (mdn) builder4.b;
                mdnVar4.b = 1 | mdnVar4.b;
                mdnVar4.c = j4;
                return (mdn) builder4.s();
            case 4:
                int i5 = mdt.d;
                aozy builder5 = ((mdn) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                long j5 = this.a;
                mdn mdnVar5 = (mdn) builder5.b;
                mdnVar5.b |= 128;
                mdnVar5.j = j5;
                return (mdn) builder5.s();
            case 5:
                xze xzeVar = mfo.a;
                if (this.a >= ((Long) obj).longValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                aozy builder6 = ((uhh) obj).toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                long j6 = this.a;
                uhh uhhVar = (uhh) builder6.b;
                uhhVar.b = 1 | uhhVar.b;
                uhhVar.c = j6;
                return (uhh) builder6.s();
            case 7:
                akfc akfcVar = uwu.a;
                aozy builder7 = ((uwt) obj).toBuilder();
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                long j7 = this.a;
                uwt uwtVar = (uwt) builder7.b;
                uwtVar.b |= 4;
                uwtVar.c = j7;
                return (uwt) builder7.s();
            case 8:
                aozy builder8 = ((vdv) obj).toBuilder();
                if (!builder8.b.isMutable()) {
                    builder8.u();
                }
                ((vdv) builder8.b).g = this.a;
                return (vdv) builder8.s();
            case 9:
                aozy builder9 = ((vdv) obj).toBuilder();
                if (!builder9.b.isMutable()) {
                    builder9.u();
                }
                ((vdv) builder9.b).d = this.a;
                return (vdv) builder9.s();
            case 10:
                aozy builder10 = ((vdt) obj).toBuilder();
                if (!builder10.b.isMutable()) {
                    builder10.u();
                }
                ((vdt) builder10.b).b = this.a;
                return (vdt) builder10.s();
            case 11:
                Long l = (Long) obj;
                if (l == null) {
                    return Long.valueOf(this.a);
                }
                return l;
            case 12:
                vee veeVar = (vee) obj;
                aozy builder11 = veeVar.toBuilder();
                int i6 = veeVar.r + 1;
                if (!builder11.b.isMutable()) {
                    builder11.u();
                }
                apag apagVar = builder11.b;
                ((vee) apagVar).r = i6;
                if (!apagVar.isMutable()) {
                    builder11.u();
                }
                ((vee) builder11.b).q = this.a;
                return (vee) builder11.s();
            case 13:
                aozy builder12 = ((vee) obj).toBuilder();
                if (!builder12.b.isMutable()) {
                    builder12.u();
                }
                ((vee) builder12.b).e = this.a;
                return (vee) builder12.s();
            case 14:
                ((alvg) ((alvg) vqp.a.j().g((Exception) obj)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "storeAttachmentInTelephonyDb", 378, "RcsTelephonyAccessImpl.java")).s("Failed to delete existing attachments in Telephony. Telephony Message: %s", this.a);
                return true;
            case 15:
                int i7 = xbw.c;
                aozy builder13 = ((xbu) obj).toBuilder();
                if (!builder13.b.isMutable()) {
                    builder13.u();
                }
                long j8 = this.a;
                xbu xbuVar = (xbu) builder13.b;
                xbuVar.b = 1 | xbuVar.b;
                xbuVar.c = j8;
                return (xbu) builder13.s();
            case 16:
                yey yeyVar = (yey) obj;
                aozy builder14 = yeyVar.toBuilder();
                yeu yeuVar = yeyVar.c;
                if (yeuVar == null) {
                    yeuVar = yeu.a;
                }
                aozy builder15 = yeuVar.toBuilder();
                if (!builder15.b.isMutable()) {
                    builder15.u();
                }
                long j9 = this.a;
                yeu yeuVar2 = (yeu) builder15.b;
                yeuVar2.b |= 1;
                yeuVar2.c = j9;
                yeu yeuVar3 = (yeu) builder15.s();
                if (!builder14.b.isMutable()) {
                    builder14.u();
                }
                yey yeyVar2 = (yey) builder14.b;
                yeuVar3.getClass();
                yeyVar2.c = yeuVar3;
                yeyVar2.b |= 1;
                return (yey) builder14.s();
            case 17:
                yey yeyVar3 = (yey) obj;
                aozy builder16 = yeyVar3.toBuilder();
                yev yevVar = yeyVar3.d;
                if (yevVar == null) {
                    yevVar = yev.a;
                }
                aozy builder17 = yevVar.toBuilder();
                if (!builder17.b.isMutable()) {
                    builder17.u();
                }
                long j10 = this.a;
                yev yevVar2 = (yev) builder17.b;
                yevVar2.b = 1 | yevVar2.b;
                yevVar2.c = j10;
                yev yevVar3 = (yev) builder17.s();
                if (!builder16.b.isMutable()) {
                    builder16.u();
                }
                yey yeyVar4 = (yey) builder16.b;
                yevVar3.getClass();
                yeyVar4.d = yevVar3;
                yeyVar4.b |= 2;
                return (yey) builder16.s();
            default:
                yey yeyVar5 = (yey) obj;
                aozy builder18 = yeyVar5.toBuilder();
                yev yevVar4 = yeyVar5.d;
                if (yevVar4 == null) {
                    yevVar4 = yev.a;
                }
                aozy builder19 = yevVar4.toBuilder();
                if (!builder19.b.isMutable()) {
                    builder19.u();
                }
                long j11 = this.a;
                yev yevVar5 = (yev) builder19.b;
                yevVar5.b |= 2;
                yevVar5.d = j11;
                yev yevVar6 = (yev) builder19.s();
                if (!builder18.b.isMutable()) {
                    builder18.u();
                }
                yey yeyVar6 = (yey) builder18.b;
                yevVar6.getClass();
                yeyVar6.d = yevVar6;
                yeyVar6.b |= 2;
                return (yey) builder18.s();
        }
    }
}
