package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afid extends afih {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen");
    public addp aA;
    public aiim aB;
    public aodz aC;
    private final agek aU;
    private final arml aV;
    private final arml aW;
    private final arml aX;
    private boolean aY;
    private final arml aZ;
    public ContentResolver ag;
    public afgb ah;
    public afhx ai;
    public boolean aj;
    public boolean ak;
    public final arml al;
    public afks am;
    public Optional an;
    public Activity ao;
    public Optional ap;
    public Optional aq;
    public aful ar;
    public afdv as;
    public arwe at;
    public Optional au;
    public armf av;
    public adwp aw;
    public adwp ax;
    public adwo ay;
    public afxz az;
    public RecyclerView b;
    private afil ba;
    private final arml bb;
    private afii bc;
    private afio bd;
    private afin be;
    private final arml bf;
    private final arml bg;
    public View c;
    public FloatingActionButton d;
    public FloatingActionButton e;

    public afid() {
        super(Integer.valueOf(R.layout.camera_gallery_screen_layout), new afhw(null, null, null, false, false, false, false, 1023));
        this.aU = agek.a;
        this.aV = armd.a(new afhj(this, 15));
        this.aW = armd.a(new afhj(this, 10));
        this.aX = armd.a(new afhj(this, 9));
        this.ai = afhx.a;
        afhj afhjVar = new afhj(this, 12);
        int i = arsc.a;
        this.aZ = new eot(new arrh(afif.class), new afhj(this, 18), afhjVar, new afhj(this, 19));
        this.al = armd.a(new afhj(this, 11));
        armd.a(new afhj(this, 7));
        this.bb = armd.a(new afhj(this, 14));
        this.bf = armd.a(new afhj(this, 13));
        this.bg = armd.a(new afhj(this, 17));
    }

    private final void bA(List list) {
        arrn.J(bo(), null, null, new lxi(list, this, (arpe) null, 8), 3);
    }

    private final aiim bB() {
        return (aiim) this.aX.a();
    }

    public static final /* synthetic */ afhw e(afid afidVar) {
        return (afhw) afidVar.bj();
    }

    public final afhq a() {
        return (afhq) this.bf.a();
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.aU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aN(java.util.List r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afhy
            if (r0 == 0) goto L13
            r0 = r8
            afhy r0 = (defpackage.afhy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            afhy r0 = new afhy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = r0.a
            afid r0 = r0.f
            defpackage.aqil.P(r8)
            r8 = r7
            r7 = r1
            goto L5c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.aqil.P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            arwe r2 = r6.aP()
            arpi r2 = r2.b()
            afhz r4 = new afhz
            r5 = 0
            r4.<init>(r7, r6, r8, r5)
            r0.f = r6
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = defpackage.arro.q(r2, r4, r0)
            if (r0 == r1) goto La6
            r0 = r6
        L5c:
            int r1 = r7.size()
            int r2 = r8.size()
            int r1 = r1 - r2
            if (r1 <= 0) goto La0
            int r7 = r7.size()
            android.content.Context r2 = r0.y()
            android.content.res.Resources r2 = r2.getResources()
            if (r1 != r3) goto L7f
            if (r7 != r3) goto L7f
            r7 = 2132018709(0x7f140615, float:1.9675732E38)
            java.lang.String r7 = r2.getString(r7)
            goto L8f
        L7f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r7 = 2131886115(0x7f120023, float:1.94068E38)
            java.lang.String r7 = r2.getQuantityString(r7, r1, r3)
        L8f:
            r7.getClass()
            cj r1 = r0.F()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            defpackage.afwv.B(r7, r1)
        La0:
            r0.bA(r8)
            arnb r7 = defpackage.arnb.a
            return r7
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afid.aN(java.util.List, arpe):java.lang.Object");
    }

    public final List aO() {
        return (List) this.aV.a();
    }

    public final arwe aP() {
        arwe arweVar = this.at;
        if (arweVar != null) {
            return arweVar;
        }
        arro.b("localIoScope");
        return null;
    }

    public final ascv aQ() {
        afkx afkxVar;
        afks afksVar = null;
        if (((afhw) bj()).g) {
            afku afkuVar = ((afkq) bn().a()).b;
            if (afkuVar instanceof afkx) {
                afkxVar = (afkx) afkuVar;
            } else {
                afkxVar = null;
            }
            if (afkxVar != null) {
                return afkxVar.c();
            }
        }
        afks afksVar2 = this.am;
        if (afksVar2 == null) {
            arro.b("attachmentsViewModel");
        } else {
            afksVar = afksVar2;
        }
        return afksVar.b;
    }

    @Override // defpackage.agem
    public final void aT(afzr afzrVar) {
        ((alvg) a.d().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "applyHugoColors", 279, "CameraGalleryScreen.kt")).t("Applying HugoColors: %s", afzrVar);
        afio afioVar = this.bd;
        if (afioVar != null) {
            afioVar.d = new aezb(afzrVar, 9);
            afioVar.p();
        }
        bB().m(afzrVar.h, afzrVar.i);
    }

    public final void aU(afts aftsVar) {
        bA(aqjn.y(aftsVar));
    }

    public final void aV() {
        bB().l();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            arro.b("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        bc();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
    public final void aW() {
        afil afilVar;
        afio afioVar;
        adwp adwpVar = this.aw;
        afgb afgbVar = null;
        if (adwpVar == null) {
            arro.b("selectMediaPermissionRequestAdapterFactory");
            adwpVar = null;
        }
        zay zayVar = new zay((Object) this, 3, (short[]) null);
        aiim aiimVar = (aiim) adwpVar.a.b();
        aiimVar.getClass();
        this.be = new afin(aiimVar, zayVar);
        ba(false);
        Optional optional = this.au;
        if (optional == null) {
            arro.b("headerControllerOptional");
            optional = null;
        }
        iou iouVar = (iou) arsd.k(optional);
        if (iouVar != null) {
            afilVar = new afil();
            arrn.J(ene.b(this), null, null, new wfj(afilVar, iouVar, this, (arpe) null, 6), 3);
        } else {
            afilVar = null;
        }
        this.ba = afilVar;
        Optional optional2 = this.an;
        if (optional2 == null) {
            arro.b("cameraAdapterFactory");
            optional2 = null;
        }
        Optional map = optional2.map(new admk(new aezb(this, 10), 17));
        map.getClass();
        this.bc = (afii) arsd.k(map);
        if (((afhw) bj()).c.d) {
            afhv d = d();
            d.getClass();
            afioVar = new afio(d, new zay((Object) this, 4, (int[]) null), new ncd((Object) this, 13, (byte[][][]) null));
        } else {
            afioVar = null;
        }
        this.bd = afioVar;
        adwp adwpVar2 = this.ax;
        if (adwpVar2 == null) {
            arro.b("galleryMediaAdapterFactory");
            adwpVar2 = null;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            arro.b("recyclerView");
            recyclerView = null;
        }
        affz affzVar = new affz(recyclerView);
        afhj afhjVar = new afhj(this, 8);
        ncd ncdVar = new ncd((Object) this, 10, (int[][]) null);
        afhv d2 = d();
        adec adecVar = (adec) adwpVar2.a.b();
        d2.getClass();
        afij afijVar = new afij(adecVar, affzVar, afhjVar, ncdVar, d2);
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null) {
            arro.b("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.ah(new ageq());
        aqws aqwsVar = new aqws(null, null, null);
        aqwsVar.k();
        lq j = aqwsVar.j();
        no[] noVarArr = (no[]) aqil.o(new no[]{this.ba, this.be, this.bc, this.bd, afijVar}).toArray(new no[0]);
        recyclerView2.ag(new lr(j, (no[]) Arrays.copyOf(noVarArr, noVarArr.length)));
        ageu ageuVar = (ageu) this.bg.a();
        recyclerView2.getClass();
        if (recyclerView2.C instanceof ageq) {
            arrn.J(ene.b(ageuVar.a.O()), null, null, new wju(ageuVar, recyclerView2, new agef(afijVar, 2), afijVar, (arpe) null, 11), 3);
            arrn.J(ene.b(O()), null, null, new adzx(recyclerView2, this, (arpe) null, 18), 3);
            aV();
            arrn.J(ene.b(this), null, null, new adzx(this, afijVar, (arpe) null, 19), 3);
            afijVar.F(new aezb(this, 11));
            Handler handler = new Handler(Looper.getMainLooper());
            afgd a2 = p().a();
            RecyclerView recyclerView3 = this.b;
            if (recyclerView3 == null) {
                arro.b("recyclerView");
                recyclerView3 = null;
            }
            this.ah = new afgb(handler, a2, afijVar, recyclerView3);
            ContentResolver contentResolver = this.ag;
            if (contentResolver == null) {
                arro.b("contentResolver");
                contentResolver = null;
            }
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            afgb afgbVar2 = this.ah;
            if (afgbVar2 == null) {
                arro.b("galleryMediaObserver");
                afgbVar2 = null;
            }
            contentResolver.registerContentObserver(uri, true, afgbVar2);
            Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            afgb afgbVar3 = this.ah;
            if (afgbVar3 == null) {
                arro.b("galleryMediaObserver");
            } else {
                afgbVar = afgbVar3;
            }
            contentResolver.registerContentObserver(uri2, true, afgbVar);
            this.aY = true;
            by();
            return;
        }
        throw new IllegalArgumentException("Expected RecyclerView to have an ItemAnimator that implements SelectionItemAnimator, consider using NoChangeAnimationDefaultItemAnimator.");
    }

    @Override // defpackage.agem
    public final void aX() {
        afii afiiVar = this.bc;
        if (afiiVar != null) {
            arrn.J(afiiVar.c, null, null, new aely(afiiVar, (arpe) null, 12), 3);
            if (afiiVar.e.b) {
                afiiVar.d.N().d(afiiVar);
            }
        }
    }

    @Override // defpackage.agem
    public final void aY() {
        afii afiiVar = this.bc;
        if (afiiVar != null) {
            afgs afgsVar = afiiVar.f;
            if (afgsVar != null) {
                afiiVar.m(afgsVar);
            }
            if (afiiVar.e.b) {
                afiiVar.d.N().c(afiiVar);
            }
        }
    }

    public final void aZ() {
        be().G();
    }

    @Override // defpackage.cg
    public final void af() {
        super.af();
        afhx o = o();
        if (br() && o != afhx.a && o != this.ai) {
            ((alvg) a.g().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "checkIfMediaPermissionsAreUpgraded", 333, "CameraGalleryScreen.kt")).D("Image/video permission changed from %s to %s, refreshing camera gallery screen.", this.ai, o);
            afhx afhxVar = this.ai;
            if (afhxVar == afhx.a) {
                aW();
            } else if (afhxVar == afhx.b) {
                afhq a2 = a();
                if (a2 != null) {
                    a2.a(false, false);
                }
                afin afinVar = this.be;
                if (afinVar != null) {
                    afinVar.y(0);
                }
                afgb afgbVar = this.ah;
                if (afgbVar == null) {
                    arro.b("galleryMediaObserver");
                    afgbVar = null;
                }
                afgbVar.onChange(true);
            }
            this.ai = o;
        }
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        bh().f("CameraGalleryScreen#onViewCreated", new aenj(this, view, 13));
    }

    public final void ba(boolean z) {
        boolean z2;
        afhq a2 = a();
        if (a2 != null) {
            afin afinVar = this.be;
            if (afinVar != null) {
                z2 = afinVar.m();
            } else {
                z2 = false;
            }
            a2.a(z, z2);
        }
        if (z && ((afhw) bj()).f) {
            bz().c(true);
        }
    }

    public final void bb(int i, Integer num, int i2, View.OnClickListener onClickListener) {
        aiim.v(bB(), Integer.valueOf(i), num, Integer.valueOf(i2), onClickListener);
        RecyclerView recyclerView = this.b;
        View view = null;
        if (recyclerView == null) {
            arro.b("recyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view2 = this.c;
        if (view2 == null) {
            arro.b("fabsContainer");
        } else {
            view = view2;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bc() {
        /*
            r7 = this;
            boolean r0 = r7.aj
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L19
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.e
            if (r0 != 0) goto L11
            java.lang.String r0 = "systemGalleryPickerFab"
            defpackage.arro.b(r0)
            r0 = r1
        L11:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r3
        L1a:
            boolean r4 = r7.ak
            if (r4 != 0) goto L30
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r7.d
            if (r4 != 0) goto L28
            java.lang.String r4 = "cameraFab"
            defpackage.arro.b(r4)
            r4 = r1
        L28:
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L30
            r4 = r2
            goto L31
        L30:
            r4 = r3
        L31:
            if (r0 != 0) goto L38
            if (r4 == 0) goto L36
            goto L38
        L36:
            r0 = r3
            goto L39
        L38:
            r0 = r2
        L39:
            android.view.View r4 = r7.c
            java.lang.String r5 = "fabsContainer"
            if (r4 != 0) goto L43
            defpackage.arro.b(r5)
            r4 = r1
        L43:
            int r4 = r4.getVisibility()
            if (r4 == 0) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = r2
        L4c:
            if (r4 != r0) goto L4f
            return
        L4f:
            android.view.View r4 = r7.L()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            arml r6 = r7.aW
            java.lang.Object r6 = r6.a()
            android.transition.Slide r6 = (android.transition.Slide) r6
            android.transition.TransitionManager.beginDelayedTransition(r4, r6)
            android.view.View r4 = r7.c
            if (r4 != 0) goto L68
            defpackage.arro.b(r5)
            goto L69
        L68:
            r1 = r4
        L69:
            if (r2 == r0) goto L6d
            r3 = 8
        L6d:
            r1.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afid.bc():void");
    }

    public final aiim bd() {
        aiim aiimVar = this.aB;
        if (aiimVar != null) {
            return aiimVar;
        }
        arro.b("permissionsManager");
        return null;
    }

    public final aodz be() {
        aodz aodzVar = this.aC;
        if (aodzVar != null) {
            return aodzVar;
        }
        arro.b("systemContentPickerLauncher");
        return null;
    }

    public final afhv d() {
        return (afhv) this.bb.a();
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        Uri uri;
        armo armoVar;
        String string;
        super.g(bundle);
        afgo afgoVar = ((afhw) bj()).d;
        Activity activity = null;
        if (afgoVar != null) {
            ncd ncdVar = new ncd(this, 14, (boolean[][]) null);
            if (bundle != null && (string = bundle.getString("compose_pending_system_camera_uri")) != null) {
                uri = Uri.parse(string);
            } else {
                uri = null;
            }
            afgv afgvVar = (afgv) afgoVar.a;
            afgvVar.l = uri;
            int i = 2;
            armo[] armoVarArr = new armo[2];
            armoVarArr[0] = new armo(afsu.a, new sn());
            Duration duration = afgvVar.h;
            if (duration != null) {
                armoVar = new armo(afsv.a, new afgu(duration));
            } else {
                armoVar = new armo(afsv.a, new sf());
            }
            armoVarArr[1] = armoVar;
            Map m = aqjn.m(armoVarArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(m.size()));
            for (Map.Entry entry : m.entrySet()) {
                Object key = entry.getKey();
                afsw afswVar = (afsw) entry.getKey();
                se seVar = (se) entry.getValue();
                cj cjVar = afgvVar.i;
                Objects.toString(afswVar);
                linkedHashMap.put(key, cjVar.g.a("compose_camera_launcher_".concat(String.valueOf(afswVar)), seVar, new llb(afswVar, afgvVar, ncdVar, i)));
            }
            afgvVar.k = linkedHashMap;
        }
        aodz be = be();
        Activity activity2 = this.ao;
        if (activity2 == null) {
            arro.b("activity");
        } else {
            activity = activity2;
        }
        aodz.I(be, activity, ((afhw) bj()).c, new yjk(this, 4));
    }

    @Override // defpackage.cg
    public final void h() {
        super.h();
        if (this.aY) {
            ContentResolver contentResolver = this.ag;
            afgb afgbVar = null;
            if (contentResolver == null) {
                arro.b("contentResolver");
                contentResolver = null;
            }
            afgb afgbVar2 = this.ah;
            if (afgbVar2 == null) {
                arro.b("galleryMediaObserver");
            } else {
                afgbVar = afgbVar2;
            }
            contentResolver.unregisterContentObserver(afgbVar);
            this.aY = false;
        }
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        Uri uri;
        afgo afgoVar = ((afhw) bj()).d;
        if (afgoVar != null && (uri = ((afgv) afgoVar.a).l) != null) {
            bundle.putString("compose_pending_system_camera_uri", uri.toString());
        }
    }

    public final afhx o() {
        if (aeke.bO(bd(), aqjn.B(afkj.i, afkj.j))) {
            return afhx.c;
        }
        if (bd().s(afkj.h)) {
            return afhx.b;
        }
        return afhx.a;
    }

    public final afif p() {
        return (afif) this.aZ.a();
    }

    public final aful q() {
        aful afulVar = this.ar;
        if (afulVar != null) {
            return afulVar;
        }
        arro.b("localMediaResolver");
        return null;
    }

    @Override // defpackage.ageb
    public final agea r() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.camera_gallery_recycler_view)) != null) {
            return afzv.q(recyclerView);
        }
        return null;
    }
}
