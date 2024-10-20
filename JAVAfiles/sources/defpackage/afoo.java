package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afoo extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoo(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [afke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean z;
        boolean z2;
        aiim aiimVar;
        afni afniVar = null;
        AccessibilityManager accessibilityManager = null;
        boolean z3 = false;
        switch (this.b) {
            case 0:
                final afoq afoqVar = (afoq) this.a;
                afjh afjhVar = new afjh() { // from class: afon
                    @Override // defpackage.afjh
                    public final boolean a(Object obj, int i, Object obj2) {
                        afoj afojVar;
                        afom afomVar = (afom) obj;
                        arnb arnbVar = null;
                        if (afomVar instanceof afoj) {
                            afojVar = (afoj) afomVar;
                        } else {
                            afojVar = null;
                        }
                        if (afojVar != null) {
                            afot H = afoq.this.H(i);
                            H.getClass();
                            afor aforVar = (afor) H;
                            arxm arxmVar = afojVar.u;
                            if (arxmVar != null) {
                                arxmVar.v(null);
                            }
                            afoq afoqVar2 = afojVar.x;
                            afojVar.u = arrn.J(afoqVar2.d, null, null, new afop(afoqVar2, aforVar, afojVar, (arpe) null, 1), 3);
                            arnbVar = arnb.a;
                        }
                        if (arnbVar != null) {
                            return true;
                        }
                        return false;
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = arsc.a;
                aeke.by(new arrh(afol.class), afjhVar, linkedHashMap);
                return aeke.bz(linkedHashMap);
            case 1:
                return ((agem) this.a).bz().b();
            case 2:
                ((afxz) ((afxz) this.a).b).b();
                int i2 = afnu.a;
                ebq ebqVar = afnt.a;
                ebqVar.getClass();
                eke ekeVar = new eke((Context) ((afxz) this.a).a, ebqVar);
                ekeVar.b = true;
                ahbf ahbfVar = ahbf.a;
                boolean z4 = ahbfVar.c;
                afxz afxzVar = (afxz) this.a;
                Object obj = afxzVar.a;
                ?? r15 = afxzVar.c;
                if (!z4) {
                    ahbfVar.c = true;
                    Context context = (Context) obj;
                    if (dzh.b(context) && !ahbf.b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahbfVar.b = z;
                    if (ahbfVar.b) {
                        agzt.d(ahbg.a);
                    } else {
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_UNLOCKED");
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(ahbfVar, intentFilter, null, null, 4);
                        } else {
                            context.registerReceiver(ahbfVar, intentFilter, null, null);
                        }
                        ahbfVar.d = true;
                        if (dzh.b(context) && !ahbf.b()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ahbfVar.b = z2;
                        if (ahbfVar.b) {
                            ahbfVar.a(context);
                            agzt.d(ahbg.a);
                        }
                    }
                }
                if (agum.b == null) {
                    synchronized (agum.class) {
                        if (agum.b == null) {
                            agum.b = new agum((Context) obj, r15);
                        }
                    }
                }
                agxg agxgVar = agxg.instance;
                if (!agxg.d) {
                    agxgVar.j = true;
                    agxe agxeVar = agxe.b;
                    if (!agxeVar.equals(agxgVar.h)) {
                        agxgVar.h = agxeVar;
                        synchronized (agxgVar.f) {
                            Iterator it = agxgVar.f.iterator();
                            while (it.hasNext()) {
                                ((agxf) it.next()).c();
                            }
                        }
                    }
                    if (!agxg.d) {
                        gvf.bd("EmojiCompatManager.init");
                        try {
                            agyd.c(agxgVar, agxg.c, agxg.b);
                            if (!agxb.a && !agxgVar.j) {
                                ejx.g(new eju(new ejw() { // from class: agxc
                                    @Override // defpackage.ejw
                                    public final void a(qdq qdqVar) {
                                        alvi alviVar = agxg.a;
                                        qdqVar.K(null);
                                    }
                                }));
                                agxg.d = true;
                            }
                            agxgVar.g = SystemClock.elapsedRealtime();
                            ekeVar.a(agxgVar.l);
                            ejx.g(ekeVar);
                            agxgVar.i.c((String) agxg.c.b());
                            agxgVar.e = alog.n(agxg.k.c((CharSequence) agxg.b.b()));
                            agxg.d = true;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                agxw.a(((afxz) this.a).d);
                return arnb.a;
            case 3:
                afxz afxzVar2 = ((afpb) this.a).e;
                if (afxzVar2 == null) {
                    arro.b("initializer");
                    afxzVar2 = null;
                }
                if (((AtomicBoolean) ((adwv) afxzVar2.e).a).compareAndSet(false, true)) {
                    afxzVar2.f.d("GboardEmojiLibraryInitializer#init", new afoo(afxzVar2, 2));
                }
                afni afniVar2 = ((afpb) this.a).b;
                if (afniVar2 == null) {
                    arro.b("frecentEmojiProvider");
                } else {
                    afniVar = afniVar2;
                }
                afniVar.a().d();
                return arnb.a;
            case 4:
                return ((agem) this.a).bz();
            case 5:
                return ((agem) this.a).bt();
            case 6:
                afxz afxzVar3 = ((afpb) this.a).d;
                if (afxzVar3 == null) {
                    arro.b("stateManagerFactory");
                    afxzVar3 = null;
                }
                aiim aiimVar2 = ((afpb) this.a).ag;
                if (aiimVar2 == null) {
                    arro.b("views");
                    aiimVar = null;
                } else {
                    aiimVar = aiimVar2;
                }
                Object obj2 = this.a;
                afoo afooVar = new afoo(obj2, 4);
                afoo afooVar2 = new afoo(obj2, 5);
                afpa afpaVar = new afpa((afpb) obj2);
                afnx afnxVar = (afnx) ((agai) obj2).bj();
                Context context2 = (Context) afxzVar3.a.b();
                context2.getClass();
                cg cgVar = (cg) ((apxx) afxzVar3.b).a;
                arwe arweVar = (arwe) afxzVar3.f.b();
                arweVar.getClass();
                anen anenVar = (anen) afxzVar3.c.b();
                anenVar.getClass();
                agva agvaVar = (agva) afxzVar3.d.b();
                agvaVar.getClass();
                afph afphVar = (afph) afxzVar3.e.b();
                afphVar.getClass();
                aiimVar.getClass();
                afnxVar.getClass();
                return new afpg(context2, cgVar, arweVar, anenVar, agvaVar, afphVar, aiimVar, afooVar, afooVar2, afpaVar, afnxVar);
            case 7:
                Optional empty = Optional.empty();
                Optional empty2 = Optional.empty();
                agvh agvhVar = new agvh();
                afpg afpgVar = (afpg) this.a;
                return new agwc(agvhVar, alog.r(afpgVar.e), empty, afpgVar.d, afpgVar.c, empty2);
            case 8:
                Object systemService = ((afpg) this.a).a.getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    accessibilityManager = (AccessibilityManager) systemService;
                }
                if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 9:
                agvp agvpVar = new agvp();
                agvpVar.d = (byte) (12 | agvpVar.d);
                agvpVar.a(false);
                agvpVar.b = 9;
                agvpVar.d = (byte) (agvpVar.d | 2);
                afpg afpgVar2 = (afpg) this.a;
                agvpVar.a = afpgVar2.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height);
                agvpVar.d = (byte) (agvpVar.d | 1);
                agvpVar.a(afpgVar2.a());
                if (agvpVar.d != 31) {
                    StringBuilder sb = new StringBuilder();
                    if ((agvpVar.d & 1) == 0) {
                        sb.append(" rowHeight");
                    }
                    if ((2 & agvpVar.d) == 0) {
                        sb.append(" columns");
                    }
                    if ((4 & agvpVar.d) == 0) {
                        sb.append(" emojiIconBackground");
                    }
                    if ((agvpVar.d & 8) == 0) {
                        sb.append(" emojiPlaceHolderDrawable");
                    }
                    if ((agvpVar.d & 16) == 0) {
                        sb.append(" popupWindowFocusable");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                return new agvq(agvpVar.a, agvpVar.b, agvpVar.c);
            case 10:
                return Integer.valueOf(((Context) this.a).getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding));
            case 11:
                return Long.valueOf(((afpr) this.a).a.getResources().getInteger(R.integer.short_animation_ms));
            case 12:
                return Integer.valueOf(((afpr) this.a).a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_descender_height));
            case 13:
                afkg afkgVar = afpo.a;
                afpr afprVar = (afpr) this.a;
                int c = afprVar.c();
                Activity activity = afprVar.a;
                activity.getClass();
                arqr arqrVar = ((afpr) this.a).g;
                arqrVar.getClass();
                int size = afpo.b.size() - 1;
                afpn a = afpo.a(activity, c, arqrVar, new aerz(size, 11), size, new iim(size, 12));
                ((afpr) this.a).b.addView(a);
                return a;
            case 14:
                return Integer.valueOf(((afpr) this.a).a.getResources().getDimensionPixelSize(R.dimen.emoji_item_default_width));
            case 15:
                afkg afkgVar2 = afpo.a;
                afpr afprVar2 = (afpr) this.a;
                int c2 = afprVar2.c();
                Activity activity2 = afprVar2.a;
                activity2.getClass();
                arqr arqrVar2 = ((afpr) this.a).g;
                arqrVar2.getClass();
                afpn a2 = afpo.a(activity2, c2, arqrVar2, aeui.r, afpo.b.size(), afob.d);
                ((afpr) this.a).b.addView(a2);
                return a2;
            case 16:
                afkg afkgVar3 = afpo.a;
                afpr afprVar3 = (afpr) this.a;
                int c3 = afprVar3.c();
                Activity activity3 = afprVar3.a;
                activity3.getClass();
                arqr arqrVar3 = ((afpr) this.a).g;
                arqrVar3.getClass();
                aeui aeuiVar = aeui.s;
                arml armlVar = aflq.a;
                afpn a3 = afpo.a(activity3, c3, arqrVar3, aeuiVar, afwv.T().size(), afob.e);
                ((afpr) this.a).b.addView(a3);
                return a3;
            case 17:
                return Integer.valueOf(((afpr) this.a).a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_size_margin));
            case 18:
                afkg afkgVar4 = afpo.a;
                afpr afprVar4 = (afpr) this.a;
                int c4 = afprVar4.c();
                Activity activity4 = afprVar4.a;
                activity4.getClass();
                arqr arqrVar4 = ((afpr) this.a).g;
                arqrVar4.getClass();
                afpn a4 = afpo.a(activity4, c4, arqrVar4, aeui.t, 1, afob.f);
                ((afpr) this.a).b.addView(a4);
                return a4;
            case 19:
                afkg afkgVar5 = afpo.a;
                afpr afprVar5 = (afpr) this.a;
                int c5 = afprVar5.c();
                Activity activity5 = afprVar5.a;
                activity5.getClass();
                arqr arqrVar5 = ((afpr) this.a).g;
                arqrVar5.getClass();
                arml armlVar2 = aflr.a;
                int size2 = afwv.S().size();
                afpn a5 = afpo.a(activity5, c5, arqrVar5, aeui.u, size2, new iim(size2, 13));
                ((afpr) this.a).b.addView(a5);
                return a5;
            default:
                Rect rect = new Rect();
                ((afpr) this.a).a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                return Integer.valueOf(rect.top);
        }
    }
}
