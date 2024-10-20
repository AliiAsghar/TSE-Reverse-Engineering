package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer");
    public static final xze b = xze.g("Bugle", "PhoneNumberInputBottomSheetFragmentPeer");
    public ahjj A;
    private final String B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final armf J;
    public final aazr d;
    public final String e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public ajcb s;
    public aazy t;
    public final alhr u;
    public rw v;
    public akbp w;
    public akbp x;
    public final AtomicReference c = new AtomicReference(Optional.empty());
    public final akbp y = new akbp<Void, Void>() { // from class: aazt.1
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            aazt.b.n("Error while trying to save manually entered phone number to disk", th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            aazt.b.l("Successfully stored manually entered phone number to disk");
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final akbp z = new akbp<String, Void>() { // from class: aazt.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ((alvg) ((alvg) ((alvg) aazt.a.i()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onFailure", 260, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Failed to increment daily retry counter for simId: %s", advq.SIM_ID.c((String) obj));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((alvg) ((alvg) aazt.a.g()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onSuccess", 253, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Successfully incremented daily retry counter for simId: %s", advq.SIM_ID.c((String) obj));
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public aazt(aazr aazrVar, aazz aazzVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22) {
        this.d = aazrVar;
        this.B = aazzVar.d;
        this.f = armfVar;
        this.g = armfVar2;
        this.C = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.D = armfVar7;
        this.E = armfVar8;
        this.k = armfVar9;
        this.F = armfVar10;
        this.l = armfVar11;
        this.u = albo.D(new ynw(armfVar12, 8));
        this.G = armfVar13;
        this.m = armfVar14;
        this.o = armfVar15;
        this.n = armfVar16;
        this.H = armfVar17;
        this.I = armfVar18;
        this.p = armfVar19;
        this.q = armfVar20;
        this.r = armfVar21;
        this.J = armfVar22;
        if ((aazzVar.b & 1) != 0) {
            this.e = aazzVar.c;
            return;
        }
        throw new IllegalArgumentException("PhoneNumberInputBottomSheetFragment does not have simId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Button a() {
        return (Button) this.d.L().findViewById(R.id.continue_button);
    }

    final EditText b() {
        return (EditText) this.d.L().findViewById(R.id.country_code_text);
    }

    public final EditText c() {
        return (EditText) this.d.L().findViewById(R.id.phone_number_text);
    }

    public final msh d() {
        Editable text = c().getText();
        ajcb ajcbVar = this.s;
        if (text != null && ajcbVar != null) {
            return ((msk) this.H.b()).c(text.toString(), new ynw(ajcbVar, 7));
        }
        return ((msk) this.H.b()).f();
    }

    public final aazy e() {
        if (this.s != null) {
            this.t = new aazy(this, this.s.c);
        } else {
            this.t = new aazy(this);
        }
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ajcb f() {
        /*
            r5 = this;
            ajcb r0 = r5.s
            if (r0 != 0) goto Lb8
            armf r0 = r5.g
            java.lang.Object r0 = r0.b()
            ykw r0 = (defpackage.ykw) r0
            java.lang.String r1 = "manual_msisdn_entered_country_code"
            byte[] r0 = r0.r(r1)
            r1 = 0
            if (r0 == 0) goto L26
            ajcb r2 = defpackage.ajcb.a     // Catch: defpackage.apba -> L1e
            apag r0 = defpackage.apag.parseFrom(r2, r0)     // Catch: defpackage.apba -> L1e
            ajcb r0 = (defpackage.ajcb) r0     // Catch: defpackage.apba -> L1e
            goto L27
        L1e:
            r0 = move-exception
            xze r2 = defpackage.aazt.b
            java.lang.String r3 = "Not able to parse country code from SharedPrefs"
            r2.r(r3, r0)
        L26:
            r0 = r1
        L27:
            if (r0 != 0) goto Lb8
            aazr r0 = r5.d
            cj r0 = r0.F()
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getSimCountryIso()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L44
            goto L46
        L44:
            r1 = r0
            goto L64
        L46:
            aazr r0 = r5.d
            android.content.Context r0 = r0.y()
            java.util.Locale r0 = defpackage.yhx.b(r0)
            if (r0 != 0) goto L53
            goto L64
        L53:
            java.lang.String r0 = r0.getCountry()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L5e
            goto L64
        L5e:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toUpperCase(r1)
        L64:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L6d
            ajcb r0 = defpackage.ajcb.a
            return r0
        L6d:
            java.lang.String r0 = defpackage.albo.aq(r1)
            armf r1 = r5.f
            java.lang.Object r1 = r1.b()
            yjr r1 = (defpackage.yjr) r1
            yjt r1 = r1.a(r0)
            boolean r2 = r1.a()
            if (r2 != 0) goto Lb6
            ajcb r2 = defpackage.ajcb.a
            aozy r2 = r2.createBuilder()
            int r1 = r1.a
            apag r3 = r2.b
            boolean r3 = r3.isMutable()
            if (r3 != 0) goto L96
            r2.u()
        L96:
            apag r3 = r2.b
            r4 = r3
            ajcb r4 = (defpackage.ajcb) r4
            r4.d = r1
            boolean r1 = r3.isMutable()
            if (r1 != 0) goto La6
            r2.u()
        La6:
            apag r1 = r2.b
            ajcb r1 = (defpackage.ajcb) r1
            r0.getClass()
            r1.c = r0
            apag r0 = r2.s()
            ajcb r0 = (defpackage.ajcb) r0
            return r0
        Lb6:
            ajcb r0 = defpackage.ajcb.a
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazt.f():ajcb");
    }

    public final String g() {
        Editable text = c().getText();
        ajcb ajcbVar = this.s;
        if (text != null && ajcbVar != null) {
            return ((yjr) this.f.b()).o(text.toString(), ajcbVar.c);
        }
        return "";
    }

    public final String h() {
        if (((Boolean) new msn(16).get()).booleanValue()) {
            return albo.ag(d().o(true));
        }
        return g();
    }

    public final void i(int i) {
        if (o()) {
            this.d.F().setResult(i);
            this.d.F().finish();
        }
    }

    public final void j() {
        ajcb ajcbVar = this.s;
        if (ajcbVar != null && !ajcb.a.equals(ajcbVar)) {
            b().setText(this.d.F().getString(R.string.registration_country_code_format, new Object[]{ajcbVar.c, String.valueOf(ajcbVar.d)}));
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [arwe, java.lang.Object] */
    public final void k(amlw amlwVar) {
        wyp wypVar = (wyp) this.J.b();
        amlx amlxVar = amlx.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT;
        int r = r();
        aozy createBuilder = amlu.a.createBuilder();
        boolean q = q();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amlu amluVar = (amlu) createBuilder.b;
        amluVar.b |= 1;
        amluVar.c = q;
        boolean p = p();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amlu amluVar2 = (amlu) createBuilder.b;
        amluVar2.b |= 4;
        amluVar2.d = p;
        amlu amluVar3 = (amlu) createBuilder.s();
        int intValue = ((Integer) ((Optional) this.c.get()).orElse(-1)).intValue();
        String str = this.e;
        amlxVar.getClass();
        amlwVar.getClass();
        if (r != 0) {
            amluVar3.getClass();
            str.getClass();
            qjh.l(wypVar.a, null, new whp(wypVar, amlxVar, amlwVar, r, amluVar3, intValue, str, null), 3);
            return;
        }
        throw null;
    }

    public final void l() {
        if (!((AccessibilityManager) this.d.F().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            Context x = this.d.x();
            if (abbv.a(x) > x.getResources().getDimensionPixelSize(R.dimen.extra_small_screen_width_dp)) {
                EditText c = c();
                ((abdc) this.D.b()).j(c.getContext(), c);
                return;
            }
        }
        m(b());
        m(c());
    }

    public final void m(EditText editText) {
        ((abdc) this.D.b()).i(editText.getContext(), editText);
    }

    public final boolean n() {
        return this.d.aw();
    }

    public final boolean o() {
        if (((opn) this.I.b()).a()) {
            try {
                return this.d.F() instanceof PhoneNumberInputV2Activity;
            } catch (IllegalStateException unused) {
                return false;
            }
        }
        return this.d.F() instanceof PhoneNumberInputV2Activity;
    }

    public final boolean p() {
        if (!o() && aczv.u().equals("phone_number_ui_variant_promo_bottomsheet")) {
            return false;
        }
        ((xvu) this.E.b()).f();
        Optional b2 = ((xvu) this.E.b()).b();
        if (!((xvu) this.E.b()).f() || !b2.isPresent() || ((xnv) this.F.b()).f().toEpochMilli() - ((Date) b2.get()).getTime() <= Duration.ofDays(((Integer) aczv.s().a.x.a()).intValue()).toMillis()) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        if (!((Boolean) aczv.s().a.R.a()).booleanValue() && ((yjy) this.C.b()).a() < 2) {
            return false;
        }
        return true;
    }

    public final int r() {
        return a.Z(Integer.parseInt(this.B));
    }

    public final void s(int i) {
        wfx wfxVar;
        aozy N = ((yyt) this.G.b()).N(r(), i);
        if (o()) {
            wfxVar = wfx.INPUT_FULLSCREEN;
        } else {
            wfxVar = wfx.INPUT_BOTTOMSHEET;
        }
        if (!N.b.isMutable()) {
            N.u();
        }
        wfy wfyVar = (wfy) N.b;
        wfy wfyVar2 = wfy.a;
        wfyVar.h = wfxVar.a();
        wfyVar.b |= 64;
        boolean q = q();
        if (!N.b.isMutable()) {
            N.u();
        }
        wfy wfyVar3 = (wfy) N.b;
        wfyVar3.b |= 8;
        wfyVar3.f = q;
        boolean p = p();
        if (!N.b.isMutable()) {
            N.u();
        }
        wfy wfyVar4 = (wfy) N.b;
        wfyVar4.b |= 32;
        wfyVar4.g = p;
        wfy wfyVar5 = (wfy) N.s();
        ((akbo) this.l.b()).j(ahlp.l(((yyt) this.G.b()).L(this.e, wfyVar5)), ahlp.m(wfyVar5), this.w);
    }
}
