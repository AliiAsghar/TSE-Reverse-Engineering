package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kff {
    private static final alvi i = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter");
    public final Context a;
    public final arwe b;
    public final asai c;
    public final armf d;
    public final lre e;
    public final lkd f;
    public final lfx g;
    public final jxv h;
    private final armf j;
    private final armf k;
    private final ascg l;
    private final phb m;

    public kff(Context context, arwe arweVar, asai asaiVar, lfx lfxVar, lre lreVar, lkd lkdVar, armf armfVar, ofy ofyVar, jxv jxvVar, armf armfVar2, ascg ascgVar, armf armfVar3, phb phbVar) {
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        lfxVar.getClass();
        lreVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        ofyVar.getClass();
        armfVar2.getClass();
        ascgVar.getClass();
        armfVar3.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = asaiVar;
        this.g = lfxVar;
        this.e = lreVar;
        this.f = lkdVar;
        this.j = armfVar;
        this.h = jxvVar;
        this.k = armfVar2;
        this.l = ascgVar;
        this.d = armfVar3;
        this.m = phbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.kfe
            if (r0 == 0) goto L13
            r0 = r5
            kfe r0 = (defpackage.kfe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kfe r0 = new kfe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            ascg r5 = r4.l
            r0.c = r3
            java.lang.Object r5 = defpackage.arrn.U(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.jia
            if (r0 == 0) goto L43
            jia r5 = (defpackage.jia) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            jhz r5 = r5.h
            boolean r5 = r5 instanceof defpackage.jhv
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kff.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final afag b(mxw mxwVar) {
        Spanned fromHtml;
        Object obj;
        String j;
        int T;
        List list;
        aerb aerbVar;
        String p;
        int T2;
        String str = mxwVar.a;
        str.getClass();
        fromHtml = Html.fromHtml(arsd.Z(str, "\n", "<br/>"), 63);
        String obj2 = fromHtml.toString();
        int i2 = mxwVar.b;
        if (i2 != 0) {
            switch (i2 - 1) {
                case 0:
                case 7:
                    obj = null;
                    break;
                case 1:
                    String string = this.a.getString(R.string.settings_link_text);
                    string.getClass();
                    int T3 = arsd.T(obj2, string, 0, 6);
                    if (T3 >= 0) {
                        obj = new aeie(aein.h, T3, T3 + string.length(), string, new kbt(this, 6));
                        break;
                    }
                    obj = null;
                    break;
                case 2:
                    Context context = this.a;
                    String b = ubh.b(context);
                    String string2 = context.getString(R.string.e2ee_description, b);
                    string2.getClass();
                    String string3 = this.a.getString(R.string.tombstone_learn_more_link);
                    string3.getClass();
                    int T4 = arsd.T(obj2, string3, 0, 6);
                    if (T4 >= 0) {
                        obj = new aeie(aein.h, T4, T4 + string3.length(), string3, new jze(this, (String) trz.a.e(), string2, b, 4));
                        break;
                    }
                    obj = null;
                    break;
                case 3:
                    String string4 = this.a.getString(R.string.details_link);
                    string4.getClass();
                    int T5 = arsd.T(obj2, string4, 0, 6);
                    if (T5 >= 0) {
                        obj = new aeie(aein.h, T5, T5 + string4.length(), string4, new kbt(this, 5));
                        break;
                    }
                    obj = null;
                    break;
                case 4:
                    String string5 = this.a.getString(R.string.tombstone_learn_more_link);
                    string5.getClass();
                    int T6 = arsd.T(obj2, string5, 0, 6);
                    if (T6 >= 0) {
                        obj = new aeie(aein.h, T6, T6 + string5.length(), string5, new kbt(this, 7));
                        break;
                    }
                    obj = null;
                    break;
                case 5:
                    Optional optional = (Optional) ((apxx) this.j).a;
                    if (!optional.isEmpty() && (T = arsd.T(obj2, (j = ((vni) optional.get()).j()), 0, 6)) >= 0) {
                        obj = new aeif(((vni) optional.get()).i(), T, T + j.length(), new jpi(this, ((vni) optional.get()).i(), 19, null), 24);
                        break;
                    }
                    obj = null;
                    break;
                case 6:
                    Optional optional2 = (Optional) this.k.b();
                    if (optional2.isEmpty()) {
                        ((alvg) i.i().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 339, "TombstoneUiAdapter.kt")).q("Unable to linkify. Custom theme uiAdapter not present");
                    } else {
                        String string6 = this.a.getString(R.string.change_link);
                        string6.getClass();
                        int T7 = arsd.T(obj2, string6, 0, 6);
                        if (T7 < 0) {
                            ((alvg) i.i().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 345, "TombstoneUiAdapter.kt")).q("Change link not found.");
                        } else {
                            obj = new aeie(aein.h, T7, T7 + string6.length(), this.a.getString(R.string.custom_theme_plugin_title), new jpi(this, optional2, 20, null));
                            break;
                        }
                    }
                    obj = null;
                    break;
                default:
                    Optional optional3 = (Optional) ((apxx) this.j).a;
                    if (!optional3.isEmpty() && (T2 = arsd.T(obj2, (p = ((vni) optional3.get()).p()), 0, 6)) >= 0) {
                        obj = new aeie(aein.h, T2, T2 + p.length(), new kbt(this, 8), 8);
                        break;
                    }
                    obj = null;
                    break;
            }
            if (obj != null) {
                list = aqjn.y(obj);
            } else {
                list = arnv.a;
            }
            int i3 = mxwVar.b;
            if (i3 != 0) {
                switch (i3 - 1) {
                    case 0:
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        aerbVar = null;
                        break;
                    case 2:
                        aerbVar = aerb.bD;
                        break;
                }
                return new afag(obj2, list, new aeio(this.m.a()), aerbVar, 4);
            }
            throw null;
        }
        throw null;
    }
}
