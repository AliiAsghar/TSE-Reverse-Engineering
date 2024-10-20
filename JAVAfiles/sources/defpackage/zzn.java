package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzn extends arpw implements arqy {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ yyz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(yyz yyzVar, arpe arpeVar) {
        super(5, arpeVar);
        this.e = yyzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String z;
        String str;
        boolean z2;
        aewd aewdVar;
        String string;
        String str2;
        boolean z3;
        aqil.P(obj);
        armf armfVar = this.e.b;
        ?? r2 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r5 = this.d;
        if (((opy) armfVar.b()).a() && (r2.b() != mit.GROUP || obj3 != null)) {
            ?? r4 = obj3;
            if (obj2 != zzu.a) {
                if (obj3 == null) {
                    r4 = (ResolvedRecipient) aqjn.X(r5);
                }
                vox j = r4.j();
                alog n = r4.n();
                alog n2 = r4.n();
                ArrayList<nek> arrayList = new ArrayList();
                for (Object obj4 : n2) {
                    Uri uri = ((nek) obj4).a;
                    arrayList.add(obj4);
                }
                yyz yyzVar = this.e;
                ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
                for (nek nekVar : arrayList) {
                    nekVar.getClass();
                    Uri e = xvc.e(nekVar.a);
                    if (e == null) {
                        e = nekVar.b;
                        e.getClass();
                    }
                    Uri uri2 = e;
                    Uri d = xvc.d(nekVar.a);
                    if (n.size() > 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aevv aevvVar = new aevv(uri2, Boolean.valueOf(z2), null, null, d, 12);
                    if (n.size() > 1) {
                        aewdVar = aewd.a;
                    } else {
                        aewdVar = aewd.b;
                    }
                    aewg aewgVar = new aewg(aevvVar, null, 0, aewdVar, null, 54);
                    vox voxVar = nekVar.c;
                    if (voxVar == vox.PROFILE_PEOPLE_SHARING_SOURCE) {
                        string = ((Context) yyzVar.m).getString(R.string.google_profile_picture_title);
                    } else {
                        string = ((Context) yyzVar.m).getString(R.string.contact_picture_title);
                    }
                    String str3 = string;
                    str3.getClass();
                    if (nekVar.c == vox.PROFILE_CONTACT_SOURCE) {
                        str2 = ((Context) yyzVar.m).getString(R.string.contact_picture_subtitle);
                    } else {
                        str2 = null;
                    }
                    if (j == nekVar.c) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList2.add(new zzt(aewgVar, voxVar, str3, z3, str2, new zzg(yyzVar, (Object) r4, nekVar, 3)));
                }
                List au = aqjn.au(arrayList2, new kdw(j, 10, null));
                yyz yyzVar2 = this.e;
                r4.getClass();
                if (!r4.u()) {
                    vop A = r4.A();
                    if (A.b.b || A.c.b) {
                        String s = r4.s();
                        if (s != null) {
                            String x = wfh.x(s);
                            x.getClass();
                            z = vom.b(x);
                            str = z;
                            String string2 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                            string2.getClass();
                            String string3 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                            string3.getClass();
                            zzl zzlVar = new zzl(string2, string3, new wup(this.e, r4, 16, null));
                            return new zzp(str, au, zzlVar, new zzq(this.e, 1), (zzu) obj2, new zzo(false));
                        }
                        str = null;
                        String string22 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                        string22.getClass();
                        String string32 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                        string32.getClass();
                        zzl zzlVar2 = new zzl(string22, string32, new wup(this.e, r4, 16, null));
                        return new zzp(str, au, zzlVar2, new zzq(this.e, 1), (zzu) obj2, new zzo(false));
                    }
                }
                z = ((wfh) yyzVar2.l).z(r4.r(true));
                str = z;
                String string222 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                string222.getClass();
                String string322 = ((Context) this.e.m).getString(R.string.set_as_chat_picture_button_title);
                string322.getClass();
                zzl zzlVar22 = new zzl(string222, string322, new wup(this.e, r4, 16, null));
                return new zzp(str, au, zzlVar22, new zzq(this.e, 1), (zzu) obj2, new zzo(false));
            }
        }
        return null;
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zzn zznVar = new zzn(this.e, (arpe) obj5);
        zznVar.a = (miu) obj;
        zznVar.b = (zzu) obj2;
        zznVar.c = (ResolvedRecipient) obj3;
        zznVar.d = (alog) obj4;
        return zznVar.b(arnb.a);
    }
}
