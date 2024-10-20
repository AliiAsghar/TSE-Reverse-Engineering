package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import defpackage.aadn;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipq {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.afqr a(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9, defpackage.afqq r10) {
        /*
            afsz r1 = defpackage.afsz.c
            java.lang.String r0 = r9.U()
            if (r0 == 0) goto L16
            afru r0 = defpackage.afrt.b(r0)
            boolean r2 = r0 instanceof defpackage.afsk
            if (r2 == 0) goto L13
            afsk r0 = (defpackage.afsk) r0
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L18
        L16:
            afrz r0 = defpackage.afrz.a
        L18:
            r2 = r0
            android.net.Uri r0 = r9.v()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r4 = r9.c()
            int r5 = r9.b()
            long r6 = r9.l()
            afqr r9 = new afqr
            r0 = r9
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipq.a(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, afqq):afqr");
    }

    public static final aauj b() {
        return (aauj) ipi.a.a();
    }

    public static final List c() {
        aron aronVar = new aron((byte[]) null);
        aronVar.add(agek.b);
        if (((Boolean) ipe.a.e()).booleanValue()) {
            aronVar.add(agek.c);
        }
        if (((Boolean) ipe.b.e()).booleanValue()) {
            aronVar.add(agek.f);
        }
        return aqjn.x(aronVar);
    }

    public static final String d(Bundle bundle) {
        return bundle.getString("initial_search_term");
    }

    public static final ins[] e() {
        return (ins[]) ipc.b.a();
    }

    public static final ampy f(afgh afghVar, int i) {
        int i2;
        int i3;
        aozy createBuilder = ampy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ampy ampyVar = (ampy) apagVar;
        ampyVar.c = i - 1;
        ampyVar.b |= 1;
        int i4 = afghVar.e - 1;
        int i5 = 3;
        if (i4 != 1) {
            if (i4 != 2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ampy ampyVar2 = (ampy) apagVar2;
        ampyVar2.d = i2 - 1;
        ampyVar2.b |= 2;
        int i6 = afghVar.f - 1;
        if (i6 != 1) {
            if (i6 != 2) {
                i3 = 1;
            } else {
                i3 = 3;
            }
        } else {
            i3 = 2;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ampy ampyVar3 = (ampy) apagVar3;
        ampyVar3.e = i3 - 1;
        ampyVar3.b |= 4;
        boolean z = afghVar.a;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ampy ampyVar4 = (ampy) apagVar4;
        ampyVar4.b |= 8;
        ampyVar4.f = z;
        int i7 = afghVar.d - 1;
        if (i7 != 0) {
            if (i7 != 1) {
                i5 = 5;
            } else {
                i5 = 2;
            }
        }
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        ampy ampyVar5 = (ampy) createBuilder.b;
        ampyVar5.i = i5 - 1;
        ampyVar5.b |= 64;
        apag s = createBuilder.s();
        s.getClass();
        return (ampy) s;
    }

    public static final boolean g(eoz eozVar) {
        if ((eozVar instanceof akkh) && (((akkh) eozVar).E() instanceof ldu)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object h() {
        aozy createBuilder = amqj.a.createBuilder();
        amqh amqhVar = amqh.CAMERA_GALLERY;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
        amqi amqiVar = amqi.EXPANDED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        return new aauj((amqj) createBuilder.s());
    }

    public static final inr i(ins insVar) {
        int ordinal = insVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        throw new IllegalStateException("No surface for ".concat(String.valueOf(String.valueOf(insVar))));
                    }
                } else if (!((Boolean) ipe.g.e()).booleanValue()) {
                    return inr.CAMERA_GALLERY_FRAGMENT;
                }
            } else if (!((Boolean) ipe.e.e()).booleanValue()) {
                return inr.C2O_FRAGMENT;
            }
            return inr.HUGO;
        }
        return inr.IME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static inn j(cg cgVar) {
        return (inn) ((akkh) cgVar).E();
    }

    public static final /* bridge */ /* synthetic */ aiuc k() {
        throw new UnsupportedOperationException("Stub cannot create conversation fragment placeholder; check dependency configuration");
    }

    public static final String l() {
        throw new UnsupportedOperationException("Stub cannot get conversation fragment placeholder tag; check dependency configuration");
    }

    public static void m(aiuc aiucVar, itb itbVar) {
        aktp.H(aiucVar, lud.class, new itc(0));
        aktp.H(aiucVar, iuw.class, new ilx(itbVar, 8));
        aktp.H(aiucVar, iut.class, new ilx(itbVar, 9));
        aktp.H(aiucVar, jbk.class, new ilx(itbVar, 10));
        aktp.H(aiucVar, jbj.class, new ilx(itbVar, 11));
        aktp.H(aiucVar, aafs.class, new ilx(itbVar, 12));
        aktp.H(aiucVar, lyj.class, new ilx(itbVar, 13));
        aktp.H(aiucVar, aadn.a.class, new ilx(itbVar, 14));
        aktp.H(aiucVar, zph.class, new ilx(itbVar, 15));
        aktp.H(aiucVar, zpg.class, new ilx(itbVar, 3));
        aktp.H(aiucVar, ubc.class, new ilx(itbVar, 4));
        aktp.H(aiucVar, icc.class, new ilx(itbVar, 5));
        aktp.H(aiucVar, aade.class, new ilx(itbVar, 6));
        aktp.H(aiucVar, irn.class, new ilx(itbVar, 7));
    }

    public static final afxe n(Context context, Map map, Optional optional) {
        context.getClass();
        optional.getClass();
        boolean containsKey = map.containsKey(zfr.c);
        Integer valueOf = Integer.valueOf(R.drawable.shortcuts_screen_background);
        if (!containsKey && !map.containsKey(zfr.a)) {
            valueOf = null;
        }
        aron aronVar = new aron((byte[]) null);
        aronVar.add(new afxc(R.string.camera_gallery_shortcut_title, new afxb(R.drawable.ic_compose_camera_gallery_unselected_v2, new afxa(p(map, R.color.camera_gallery_shortcut_background), new agei(R.color.camera_gallery_shortcut_icon_tint))), null, gvj.m, 12));
        if (((Boolean) ipe.c.e()).booleanValue()) {
            if (ipe.b()) {
                aronVar.add(new afxc(R.string.gifs_shortcut_title, new afxb(R.drawable.gifs_shortcut_icon, new afxa(p(map, R.color.gifs_shortcut_background), new agei(R.color.gifs_shortcut_icon_tint))), null, gvj.n, 12));
            }
            if (ipe.c()) {
                aronVar.add(new afxc(R.string.stickers_shortcut_title, new afxb(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new afxa(p(map, R.color.stickers_shortcut_background), new agei(R.color.stickers_shortcut_icon_tint))), null, gvj.o, 12));
            }
        }
        aronVar.add(new afxc(R.string.files_shortcut_title, new afxb(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new afxa(p(map, R.color.files_shortcut_background), new agei(R.color.files_shortcut_icon_tint))), null, gvj.p, 12));
        if (optional.isPresent()) {
            aronVar.add(new afxc(R.string.location_shortcut_title, new afxb(R.drawable.quantum_gm_ic_place_vd_theme_24, new afxa(p(map, R.color.location_shortcut_background), new agei(R.color.location_shortcut_icon_tint))), aqjn.y(afkj.b), gvj.q, 4));
        }
        aronVar.add(new afxc(R.string.contacts_shortcut_title, new afxb(R.drawable.quantum_gm_ic_person_vd_theme_24, new afxa(p(map, R.color.contacts_shortcut_background), new agei(R.color.contacts_shortcut_icon_tint))), null, gvj.r, 12));
        if (((Boolean) wsm.a.e()).booleanValue()) {
            aronVar.add(new afxc(R.string.scheduled_send_shortcut_title, new afxb(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new afxa(p(map, R.color.scheduled_send_shortcut_background), new agei(R.color.scheduled_send_shortcut_icon_tint))), null, gvj.s, 12));
        }
        return new afxe(aqjn.x(aronVar), valueOf);
    }

    public static final aauj o() {
        return (aauj) ipx.a.a();
    }

    private static final agej p(Map map, int i) {
        if (map.containsKey(zfr.c)) {
            return new ageh();
        }
        if (map.containsKey(zfr.a)) {
            return new ageh();
        }
        return new agei(i);
    }
}
