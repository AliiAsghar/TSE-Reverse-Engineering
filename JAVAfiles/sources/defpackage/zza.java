package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zza extends arpw implements arrb {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zzb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zzb zzbVar, arpe arpeVar) {
        super(8, arpeVar);
        this.h = zzbVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String string;
        aerb aerbVar;
        aqil.P(obj);
        ?? r1 = this.a;
        ?? r2 = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.g;
        if (z) {
            int i = alog.d;
            alog alogVar = alsx.a;
            alogVar.getClass();
            return new zzc(alogVar);
        }
        mit b = r1.b();
        if (b == null || b.ordinal() != 2) {
            zzb zzbVar = this.h;
            aron aronVar = new aron((byte[]) null);
            if (obj2 != null && ((aehz) obj2).e) {
                aronVar.add(obj2);
            }
            if (obj3 != null) {
                aronVar.add(obj3);
            }
            if (((ResolvedRecipient) aqjn.ag(r2)).u()) {
                string = zzbVar.b.getString(R.string.show_contact_details);
            } else {
                string = zzbVar.b.getString(R.string.add_contact_button);
            }
            String str = string;
            str.getClass();
            if (((ResolvedRecipient) aqjn.ag(r2)).u()) {
                aerbVar = aerb.l;
            } else {
                aerbVar = aerb.ck;
            }
            aronVar.add(new aehz(str, aerbVar, false, false, false, false, null, null, new zwj(zzbVar, r2, 8, null), 1020));
            if (obj5 != null) {
                aehz aehzVar = (aehz) obj5;
                if (aehzVar.e) {
                    aronVar.add(new aehz(aehzVar.a, aehzVar.b, false, false, false, false, null, null, new zwj(obj5, zzbVar, 9), 1020));
                }
            }
            return new zzc(alzz.aZ(aqjn.x(aronVar)));
        }
        zzb zzbVar2 = this.h;
        aron aronVar2 = new aron((byte[]) null);
        if (obj3 != null) {
            aronVar2.add(obj3);
        }
        if (obj4 != null) {
            aronVar2.add(obj4);
        }
        if (obj5 != null) {
            aehz aehzVar2 = (aehz) obj5;
            if (aehzVar2.e) {
                aronVar2.add(new aehz(aehzVar2.a, aehzVar2.b, false, false, false, false, null, null, new zwj(obj5, zzbVar2, 7), 1020));
            }
        }
        return new zzc(alzz.aZ(aqjn.x(aronVar2)));
    }
}
