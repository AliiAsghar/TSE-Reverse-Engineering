package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcu extends xzu {
    public static final xze a = xze.g("Bugle", "ShortcutUtilImpl");
    private static boolean l;
    public final armf b;
    public final armf c;
    public final Context d;
    public int e;
    public final xnv f;
    public final armf g;
    public final aneo h;
    public final armf i;
    public final armf j;
    public int k = 0;
    private final armf m;
    private final armf n;
    private final armf o;
    private final anen p;
    private final anen q;
    private final Optional r;
    private final armf s;
    private final yly t;

    public abcu(armf armfVar, armf armfVar2, armf armfVar3, Context context, armf armfVar4, xnv xnvVar, armf armfVar5, armf armfVar6, anen anenVar, anen anenVar2, aneo aneoVar, Optional optional, armf armfVar7, yly ylyVar, armf armfVar8, armf armfVar9) {
        this.m = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = context;
        this.n = armfVar4;
        this.f = xnvVar;
        this.o = armfVar5;
        this.g = armfVar6;
        this.p = anenVar;
        this.q = anenVar2;
        this.h = aneoVar;
        this.r = optional;
        this.s = armfVar7;
        this.t = ylyVar;
        this.i = armfVar8;
        this.j = armfVar9;
    }

    @Deprecated
    private final String r(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return this.d.getResources().getString(R.string.unknown_sender);
        }
        return str;
    }

    @Override // defpackage.xzu
    public final ShortcutInfo a(Context context, ConversationId conversationId, String str, msh mshVar, IconCompat iconCompat, String str2, int i, boolean z) {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        int length;
        String str3;
        ShortcutInfo build;
        int length2;
        ead c = this.t.c(context, conversationId, o(str, mshVar), iconCompat, str2, i, z);
        shortLabel = new ShortcutInfo.Builder(c.a, c.b).setShortLabel(c.e);
        intents = shortLabel.setIntents(c.c);
        IconCompat iconCompat2 = c.h;
        if (iconCompat2 != null) {
            intents.setIcon(dzd.f(iconCompat2, c.a));
        }
        if (!TextUtils.isEmpty(c.f)) {
            intents.setLongLabel(c.f);
        }
        if (!TextUtils.isEmpty(c.g)) {
            intents.setDisabledMessage(c.g);
        }
        ComponentName componentName = c.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = c.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(c.m);
        PersistableBundle persistableBundle = c.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            dzv[] dzvVarArr = c.i;
            if (dzvVarArr != null && (length2 = dzvVarArr.length) > 0) {
                Person[] personArr = new Person[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    personArr[i2] = dyf.b(c.i[i2]);
                }
                intents.setPersons(personArr);
            }
            eaa eaaVar = c.k;
            if (eaaVar != null) {
                intents.setLocusId(eaaVar.b);
            }
            intents.setLongLived(c.l);
        } else {
            if (c.n == null) {
                c.n = new PersistableBundle();
            }
            dzv[] dzvVarArr2 = c.i;
            if (dzvVarArr2 != null && (length = dzvVarArr2.length) > 0) {
                c.n.putInt("extraPersonCount", length);
                int i3 = 0;
                while (i3 < c.i.length) {
                    PersistableBundle persistableBundle2 = c.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i4 = i3 + 1;
                    sb.append(i4);
                    String sb2 = sb.toString();
                    dzv dzvVar = c.i[i3];
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = dzvVar.a;
                    if (charSequence != null) {
                        str3 = charSequence.toString();
                    } else {
                        str3 = null;
                    }
                    persistableBundle3.putString("name", str3);
                    persistableBundle3.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, dzvVar.c);
                    persistableBundle3.putString("key", dzvVar.d);
                    persistableBundle3.putBoolean("isBot", dzvVar.e);
                    persistableBundle3.putBoolean("isImportant", dzvVar.f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i3 = i4;
                }
            }
            eaa eaaVar2 = c.k;
            if (eaaVar2 != null) {
                c.n.putString("extraLocusId", eaaVar2.a);
            }
            c.n.putBoolean("extraLongLived", c.l);
            intents.setExtras(c.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intents.setExcludedFromSurfaces(0);
        }
        build = intents.build();
        return build;
    }

    @Override // defpackage.xzu
    public final ConversationId b(String str) {
        List dynamicShortcuts;
        Intent intent;
        String id;
        ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(this.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
        if (m343m != null) {
            dynamicShortcuts = m343m.getDynamicShortcuts();
            Iterator it = dynamicShortcuts.iterator();
            while (true) {
                if (it.hasNext()) {
                    ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(it.next());
                    intent = m.getIntent();
                    id = m.getId();
                    if (id.equals(str) && intent != null) {
                        ConversationId j = ((lpg) this.s.b()).j(intent);
                        if (j != null) {
                            return j;
                        }
                    }
                } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                    return new BugleConversationId(str);
                }
            }
        }
        return InvalidConversationId.a;
    }

    @Override // defpackage.xzu
    public final akul c(ConversationId conversationId, String str, msh mshVar, String str2, boolean z) {
        if (!yhx.d) {
            return aktp.ag(false);
        }
        return aktp.ai(new aaze(conversationId, 2), this.q).i(new abcs(this, conversationId, str, mshVar, str2, z, 0), this.h).i(new aang(this, 18), this.h);
    }

    @Override // defpackage.xzu
    public final akul d(String str, Context context, boolean z, int i) {
        if (str == null) {
            return aktp.ag(null);
        }
        this.r.isPresent();
        if (!z) {
            return aktp.ag(IconCompat.g(context, uxi.c(i)));
        }
        Uri parse = Uri.parse(str);
        return aktp.ai(new mid(this, context, parse, context.getColor(R.color.adaptive_background_color_light), 3), this.p);
    }

    @Override // defpackage.xzu
    public final String e(String str) {
        List dynamicShortcuts;
        PersistableBundle extras;
        String id;
        ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(this.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
        if (m343m == null) {
            return null;
        }
        dynamicShortcuts = m343m.getDynamicShortcuts();
        Iterator it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(it.next());
            extras = m.getExtras();
            id = m.getId();
            if (id.equals(str) && extras != null) {
                return extras.getString("conversation_id");
            }
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.xzu
    public final String f(ConversationIdType conversationIdType) {
        return this.t.a(conversationIdType);
    }

    @Override // defpackage.xzu
    public final void g(Context context, String str) {
        aktp.aa(this.q.submit(akto.j(new aauq(this, context, str, 5))), new ydv(new aavc(2), new aavc(3), 0), andi.a);
    }

    @Override // defpackage.xzu
    public final void h(Context context) {
        g(context, "manifest-shortcut-new_message");
    }

    @Override // defpackage.xzu
    public final void i() {
        l = true;
    }

    @Override // defpackage.xzu
    public final void j() {
        if (l) {
            l = false;
            rdl rdlVar = (rdl) this.m.b();
            Context context = (Context) rdlVar.a.b();
            context.getClass();
            Optional optional = (Optional) rdlVar.b.b();
            optional.getClass();
            rrj rrjVar = (rrj) rdlVar.c.b();
            rrjVar.getClass();
            aneo aneoVar = (aneo) rdlVar.d.b();
            aneoVar.getClass();
            aneo aneoVar2 = (aneo) rdlVar.e.b();
            aneoVar2.getClass();
            new RebuildShortcutsAction(context, optional, rrjVar, aneoVar, aneoVar2).J();
        }
    }

    @Override // defpackage.xzu
    public final boolean k(String str) {
        return this.t.b(str);
    }

    @Override // defpackage.xzu
    public final akul l() {
        a.o("Starting rebuild shortcuts v2");
        return aktp.ai(new Callable() { // from class: abcr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List pinnedShortcuts;
                List dynamicShortcuts;
                to toVar;
                to toVar2;
                ShortcutManager shortcutManager;
                ArrayList arrayList;
                int i;
                boolean z;
                int i2;
                int i3;
                int i4;
                int i5;
                ShortcutManager shortcutManager2;
                int i6;
                boolean z2;
                int i7;
                ArrayList arrayList2;
                to toVar3;
                to toVar4;
                List arrayList3;
                List shortcuts;
                String id;
                String id2;
                boolean isDeclaredInManifest;
                String id3;
                abcu abcuVar = abcu.this;
                ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(abcuVar.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
                to toVar5 = new to();
                to toVar6 = new to();
                to toVar7 = new to();
                ArrayList arrayList4 = new ArrayList();
                pinnedShortcuts = m343m.getPinnedShortcuts();
                Iterator it = pinnedShortcuts.iterator();
                while (it.hasNext()) {
                    ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(it.next());
                    id2 = m.getId();
                    if (!toVar5.contains(id2)) {
                        isDeclaredInManifest = m.isDeclaredInManifest();
                        if (!isDeclaredInManifest) {
                            id3 = m.getId();
                            toVar5.add(id3);
                        }
                    }
                }
                dynamicShortcuts = m343m.getDynamicShortcuts();
                Iterator it2 = dynamicShortcuts.iterator();
                while (it2.hasNext()) {
                    id = ead$$ExternalSyntheticApiModelOutline0.m(it2.next()).getId();
                    toVar7.add(id);
                }
                if (yhx.d) {
                    try {
                        shortcuts = m343m.getShortcuts(8);
                        arrayList3 = (List) Collection.EL.stream(shortcuts).map(new aand(10)).collect(Collectors.toCollection(new zhh(15)));
                    } catch (RuntimeException e) {
                        abcu.a.r("Failed to get shortcuts: ", e);
                        arrayList3 = new ArrayList();
                    }
                    toVar6.addAll(arrayList3);
                }
                rru rruVar = (rru) abcuVar.b.b();
                int i8 = abcuVar.e;
                if (i8 <= 0) {
                    i8 = m343m.getMaxShortcutCountPerActivity();
                    abcuVar.e = i8;
                }
                int i9 = i8 - 1;
                Object obj = null;
                if (((okf) abcuVar.i.b()).a()) {
                    alog cR = ((saf) sak.c().c().a().n()).cR();
                    int i10 = ((alsx) cR).c;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i10) {
                        rruVar.N((sac) cR.get(i12));
                        String f = abcuVar.f(rruVar.L());
                        String r = rruVar.r();
                        ConversationId J = rruVar.J();
                        String q = rruVar.q();
                        if (ofn.a()) {
                            i6 = rruVar.c();
                        } else {
                            i6 = -1;
                        }
                        Optional n = rruVar.n();
                        if (qrl.a()) {
                            z2 = rruVar.R();
                        } else {
                            z2 = false;
                        }
                        int i14 = i11;
                        int i15 = i12;
                        int i16 = i10;
                        alog alogVar = cR;
                        ShortcutManager shortcutManager3 = m343m;
                        Object obj2 = obj;
                        abcuVar.q(toVar5, toVar6, toVar7, f, r, n);
                        if (i14 < i9 && ((wfh) abcuVar.g.b()).T(rruVar)) {
                            i7 = i9;
                            arrayList2 = arrayList4;
                            toVar3 = toVar7;
                            toVar4 = toVar6;
                            arrayList2.add(abcuVar.n(abcuVar.d, J, r, (msh) n.orElse(obj2), q, rruVar.K(), i6, f, i13, z2));
                            i13++;
                        } else {
                            i7 = i9;
                            arrayList2 = arrayList4;
                            toVar3 = toVar7;
                            toVar4 = toVar6;
                        }
                        i12 = i15 + 1;
                        i11 = i14 + 1;
                        arrayList4 = arrayList2;
                        toVar7 = toVar3;
                        i9 = i7;
                        toVar6 = toVar4;
                        i10 = i16;
                        cR = alogVar;
                        m343m = shortcutManager3;
                        obj = null;
                    }
                    toVar = toVar7;
                    toVar2 = toVar6;
                    shortcutManager = m343m;
                    arrayList = arrayList4;
                } else {
                    int i17 = i9;
                    toVar = toVar7;
                    toVar2 = toVar6;
                    shortcutManager = m343m;
                    arrayList = arrayList4;
                    alog cR2 = ((sar) sax.c().a().a().n()).cR();
                    int i18 = ((alsx) cR2).c;
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i18) {
                        rruVar.O((san) cR2.get(i20));
                        String f2 = abcuVar.f(rruVar.L());
                        String r2 = rruVar.r();
                        ConversationId J2 = rruVar.J();
                        String q2 = rruVar.q();
                        if (ofn.a()) {
                            i = rruVar.c();
                        } else {
                            i = -1;
                        }
                        Optional n2 = rruVar.n();
                        if (qrl.a()) {
                            z = rruVar.R();
                        } else {
                            z = false;
                        }
                        abcuVar.q(toVar5, toVar2, toVar, f2, r2, n2);
                        int i22 = i17;
                        if (i19 < i22 && ((wfh) abcuVar.g.b()).T(rruVar)) {
                            i2 = i22;
                            i3 = i19;
                            i4 = i20;
                            i5 = i18;
                            arrayList.add(abcuVar.n(abcuVar.d, J2, r2, (msh) n2.orElse(null), q2, rruVar.K(), i, f2, i21, z));
                            i21++;
                        } else {
                            i2 = i22;
                            i3 = i19;
                            i4 = i20;
                            i5 = i18;
                        }
                        i20 = i4 + 1;
                        i19 = i3 + 1;
                        i18 = i5;
                        i17 = i2;
                    }
                }
                if (!toVar5.isEmpty()) {
                    abcu.a.o("Disabling pinned shortcuts: size=" + toVar5.c);
                    shortcutManager2 = shortcutManager;
                    shortcutManager2.disableShortcuts(alzz.an(toVar5));
                } else {
                    shortcutManager2 = shortcutManager;
                }
                if (yhx.d && !toVar2.isEmpty()) {
                    to toVar8 = toVar2;
                    abcu.a.o("Deleting long lived shortcuts: size=" + toVar8.c);
                    shortcutManager2.removeLongLivedShortcuts(alzz.an(toVar8));
                }
                to toVar9 = toVar;
                abcu.a.o("Removing dynamic shortcuts: size=" + toVar9.c);
                shortcutManager2.removeDynamicShortcuts(new ArrayList(toVar9));
                return arrayList;
            }
        }, this.q).i(new aang(this, 17), this.h).h(new tti(this, this.f.f().toEpochMilli(), 6), this.h);
    }

    public final Size m() {
        int iconMaxWidth;
        int iconMaxHeight;
        int i;
        ShortcutManager m343m = ead$$ExternalSyntheticApiModelOutline0.m343m(this.d.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m()));
        iconMaxWidth = m343m.getIconMaxWidth();
        iconMaxHeight = m343m.getIconMaxHeight();
        if (iconMaxWidth <= 0 || iconMaxHeight <= 0) {
            Context context = this.d;
            Resources resources = context.getResources();
            if (true != yhx.e(context)) {
                i = R.dimen.default_shortcut_icon_size;
            } else {
                i = R.dimen.default_shortcut_icon_size_low_ram;
            }
            iconMaxWidth = resources.getDimensionPixelSize(i);
            iconMaxHeight = iconMaxWidth;
        }
        return new Size(iconMaxWidth, iconMaxHeight);
    }

    public final akul n(final Context context, final ConversationId conversationId, final String str, final msh mshVar, String str2, mmy mmyVar, int i, final String str3, final int i2, final boolean z) {
        boolean z2;
        if (mmyVar == mmy.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        return d(str2, context, z2, i).h(new algk() { // from class: abct
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                IconCompat iconCompat = (IconCompat) obj;
                String str4 = str3;
                abcu abcuVar = abcu.this;
                Context context2 = context;
                int i3 = i2;
                String str5 = str;
                ConversationId conversationId2 = conversationId;
                boolean z3 = z;
                msh mshVar2 = mshVar;
                return abcuVar.a(context2, conversationId2, abcuVar.o(str5, mshVar2), mshVar2, iconCompat, str4, i3, z3);
            }
        }, this.h);
    }

    public final String o(String str, msh mshVar) {
        if (TextUtils.isEmpty(str)) {
            if (mshVar != null) {
                str = mshVar.n();
            } else {
                str = null;
            }
        }
        return ((wfh) this.n.b()).z(albo.ag(str));
    }

    @Deprecated
    public final String p(String str, String str2) {
        String r = r(str, str2);
        try {
            return Base64.encodeToString(MessageDigest.getInstance("MD5").digest(r.getBytes()), 3);
        } catch (NoSuchAlgorithmException e) {
            a.n("Can't get MD5.", e);
            return r;
        }
    }

    public final void q(Set set, Set set2, Set set3, String str, String str2, Optional optional) {
        String str3 = (String) optional.map(new aand(11)).orElse(null);
        set.remove(str);
        set2.remove(str);
        set3.remove(str);
        set.remove(r(str3, str2));
        set.remove(p(str3, str2));
    }
}
