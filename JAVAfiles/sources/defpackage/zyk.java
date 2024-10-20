package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyk extends arpw implements arra {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    final /* synthetic */ zyl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyk(zyl zylVar, arpe arpeVar) {
        super(7, arpeVar);
        this.g = zylVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        Context context;
        int i;
        String str;
        aein aeinVar;
        aerb aerbVar;
        aqil.P(obj);
        ?? r1 = this.a;
        boolean z2 = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        zyl zylVar = this.g;
        Object obj4 = this.e;
        ?? r7 = this.f;
        if (z2) {
            alvw g = zyl.a.g();
            g.X(alwp.a, "BugleCdp");
            ((alvg) g.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 136, "EncryptionUiAdapterImpl.kt")).q("Conversation is penpal. Action list will be empty");
            int i2 = alog.d;
            alog alogVar = alsx.a;
            alogVar.getClass();
            return new zym(alogVar);
        }
        if (obj3 != null && ((zyq) obj3).b == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            context = zylVar.b;
            i = R.string.on_text;
        } else {
            context = zylVar.b;
            i = R.string.off_text;
        }
        String string = context.getString(i);
        string.getClass();
        String string2 = zylVar.b.getString(R.string.e2e_encryption, string);
        string2.getClass();
        String string3 = zylVar.b.getString(R.string.more_about_rcs_chats);
        string3.getClass();
        String str2 = null;
        if (obj3 != null) {
            str = ((zyq) obj3).a;
        } else {
            str = null;
        }
        if (str != null && obj4 != null) {
            aron aronVar = new aron((byte[]) null);
            if (z) {
                aeinVar = aein.m;
            } else {
                aeinVar = aein.l;
            }
            int T = arsd.T(string2, string, 0, 6);
            int T2 = arsd.T(str, string3, 0, 6);
            alog s = alog.s(new aeie(aeinVar, T, T + string.length(), (arqr) null, 24), new aeie(aein.d, T, T + string.length(), (arqr) null, 24));
            s.getClass();
            aronVar.add(new aetc(1, s));
            alog r = alog.r(new aeif(string3, T2, T2 + string3.length(), new ynn(obj2, 16), 24));
            r.getClass();
            aronVar.add(new aetc(2, r));
            alog aZ = alzz.aZ(aqjn.x(aronVar));
            aron aronVar2 = new aron((byte[]) null);
            if (z) {
                aerbVar = aerb.bD;
            } else {
                aerbVar = aerb.bF;
            }
            aronVar2.add(new aeth(string2, str, null, aZ, new aete(aerbVar), yyo.m, 84));
            if (((oyp) zylVar.l.b()).a()) {
                if (((alog) r7).size() == 1) {
                    str2 = ((ResolvedRecipient) aqjn.X(r7)).f().n();
                }
            } else if (((alog) r7).size() <= 1) {
                str2 = ((ResolvedRecipient) aqjn.X(r7)).f().n();
            }
            if (r1.b() != mit.GROUP && z && str2 != null && str2.length() != 0) {
                String string4 = zylVar.b.getString(R.string.verify_encryption);
                string4.getClass();
                aronVar2.add(new aeth(string4, null, null, null, new aete(aerb.aL), new zwj(zylVar, obj4, 3), 94));
            }
            return new zym(alzz.aZ(aqjn.x(aronVar2)));
        }
        alvw g2 = zyl.a.g();
        g2.X(alwp.a, "BugleCdp");
        ((alvg) g2.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 151, "EncryptionUiAdapterImpl.kt")).q("E2eeStatusUiAdapter returned empty status text or active self identity is empty.");
        int i3 = alog.d;
        alog alogVar2 = alsx.a;
        alogVar2.getClass();
        return new zym(alogVar2);
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        zyk zykVar = new zyk(this.g, (arpe) obj7);
        zykVar.a = (miu) obj;
        zykVar.b = booleanValue;
        zykVar.c = (aehz) obj3;
        zykVar.d = (zyq) obj4;
        zykVar.e = (nfw) obj5;
        zykVar.f = (alog) obj6;
        return zykVar.b(arnb.a);
    }
}
