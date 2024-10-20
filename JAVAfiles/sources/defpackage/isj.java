package defpackage;

import android.app.AlertDialog;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isj implements akgs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public isj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akgs
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                xzb.p("Bugle", th, "outGoingReactionsCountDatasource onLoadError");
                return;
            case 1:
                ((alwl) ((alwl) ((alwl) ilw.a.i()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$RcsEnabledGlobalCallback", "onLoadError", (char) 1420, "DraftEditorFragmentPeer.java")).q("Error loading RCS enabled data");
                return;
            case 2:
                xzb.p("Bugle", th, "Error loading data for file progress callback..");
                return;
            case 3:
                xzb.p("BugleTyping", th, "Error loading data for typing indicator callback.");
                return;
            case 4:
                xyo e = kuy.a.e();
                e.H("Data-source error encountered while receiving information about a GAIA-related error.");
                e.r(th);
                return;
            case 5:
                alvw i = lrp.a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).g(th).h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoadError", 89, "IdentityDetailsFragmentPeer.kt")).q("Failed to load identity details");
                ((lrp) this.a).a().setVisibility(4);
                return;
            case 6:
                ((zhw) this.a).an.ifPresent(new zhp(this, 13));
                ((alwl) ((alwl) zhw.c.i()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$3", "onLoadError", 817, "ApplicationSettingsFragmentPeer.java")).q("Failed to load expressive animations settings");
                return;
            case 7:
                ((zhw) this.a).am.ifPresent(new zhp(this, 15));
                ((alwl) ((alwl) zhw.c.i()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$4", "onLoadError", 867, "ApplicationSettingsFragmentPeer.java")).q("Failed to load fast image sending setting");
                return;
            case 8:
                ((zhw) this.a).g();
                return;
            case 9:
                ((alvg) ((alvg) ((alvg) zkv.a.i()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoadError", (char) 572, "RcsSettingsFragmentV2Peer.java")).q("Error loading RCS default on data");
                return;
            case 10:
                return;
            case 11:
                xzb.p("Bugle", th, "Failed to get registration state");
                AlertDialog alertDialog = ((aaok) this.a).g;
                if (alertDialog != null) {
                    alertDialog.setMessage("Status: Failed");
                    return;
                }
                return;
            case 12:
                alvw i2 = aazh.a.i();
                i2.X(alwp.a, "BugleRcs");
                ((alvg) ((alvg) ((alvg) i2).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoadError", (char) 158, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("Failed to load terms and conditions data");
                aazk aazkVar = ((aazh) this.a).l;
                if (aazkVar != null) {
                    aazkVar.d();
                    return;
                }
                return;
            default:
                ((alvg) ((alvg) ((alvg) aazt.a.i()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$GetPhoneNumberInputDataCallback", "onLoadError", (char) 245, "PhoneNumberInputBottomSheetFragmentPeer.java")).q("Failed to get PhoneNumberInputUiSimInfo");
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
    @Override // defpackage.akgs
    public final /* synthetic */ void b(Object obj) {
        alor alorVar;
        int i = 2;
        boolean z = true;
        z = true;
        int i2 = 0;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                itb itbVar = (itb) this.a;
                itbVar.aJ = booleanValue;
                ird irdVar = itbVar.aq;
                if (irdVar != null) {
                    irdVar.c.q(0);
                    return;
                }
                return;
            case 1:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    ((ilw) this.a).y.E().c.M = ((Boolean) optional.get()).booleanValue();
                    return;
                }
                return;
            case 2:
                aluq listIterator = ((alor) obj).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    if (!((xog) entry.getValue()).equals(((itb) this.a).aF.get(entry.getKey()))) {
                        ((itb) this.a).aF.put((MessageIdType) entry.getKey(), (xog) entry.getValue());
                        Object obj2 = this.a;
                        MessageIdType messageIdType = (MessageIdType) entry.getKey();
                        itb itbVar2 = (itb) obj2;
                        Map map = itbVar2.aG;
                        Instant instant = Instant.MIN;
                        if (map.containsKey(messageIdType)) {
                            instant = (Instant) itbVar2.aG.get(messageIdType);
                        }
                        if (Duration.between(instant, itbVar2.o.f()).compareTo(itb.c) <= 0) {
                            xzb.d("Bugle", "Throttling file progress update for messageId: %s. Not updating view.", messageIdType);
                        } else {
                            itbVar2.aG.put(messageIdType, itbVar2.o.f());
                            irr irrVar = itbVar2.aq.c;
                            int F = irrVar.F(messageIdType);
                            if (F == -1) {
                                xzb.o("Bugle", "Trying to update file transfer progress for messageId %s with fragment not in view.", messageIdType);
                            } else {
                                irrVar.r(F, entry.getValue());
                            }
                        }
                    }
                }
                return;
            case 3:
                alor alorVar2 = (alor) obj;
                if (((itb) this.a).af.b()) {
                    xzb.n("BugleTyping", "onLoaded() typing indicator data before conversation ID has been loaded.");
                    return;
                }
                if (alorVar2.containsKey(((itb) this.a).af)) {
                    alorVar = (alor) alorVar2.get(((itb) this.a).af);
                } else {
                    alorVar = altc.a;
                }
                Object obj3 = this.a;
                itb itbVar3 = (itb) obj3;
                if (!itbVar3.ay.g()) {
                    xzb.n("BugleTyping", "typing indicator processed ConversationData is set. This can happen before onCreateActivity() or after onDestroy().");
                    return;
                }
                alpt alptVar = (alpt) Collection.EL.stream(alorVar.entrySet()).filter(new isg(obj3, z ? 1 : 0)).map(new isa(z ? 1 : 0)).map(new isa(i2)).collect(alls.b);
                Collection.EL.stream(alptVar).forEach(new ile(18));
                if (itbVar3.ay.g() && ((rrl) itbVar3.ay.a()).s() && ((rrl) itbVar3.ay.a()).p()) {
                    rsa rsaVar = ((rrl) itbVar3.ay.a()).e;
                    Stream filter = rsaVar.e().filter(new ilu(i)).filter(new isg(alptVar, i2));
                    int i3 = alog.d;
                    alog alogVar = (alog) filter.collect(alls.a);
                    xzb.k("BugleTyping", "%d active typing notifications.", Integer.valueOf(alptVar.size()));
                    if (alogVar.size() > alptVar.size()) {
                        xzb.o("BugleTyping", "Found %d participants for %d typing notifications. Trimming duplicate participants...", Integer.valueOf(alogVar.size()), Integer.valueOf(alptVar.size()));
                        alob alobVar = new alob();
                        aluq listIterator2 = alptVar.listIterator();
                        while (listIterator2.hasNext()) {
                            ParticipantsTable.BindData c = rsaVar.c((String) listIterator2.next(), null);
                            if (c != null) {
                                if (c.p() != -2) {
                                    xzb.n("BugleTyping", "Found a typing notification for a self-participant, skipping...");
                                } else {
                                    alobVar.h(c);
                                }
                            }
                        }
                        alogVar = alobVar.g();
                        xzb.k("BugleTyping", "Trimmed to %d typing participants.", Integer.valueOf(((alsx) alogVar).c));
                    }
                    itbVar3.aq.l(alogVar);
                    return;
                }
                ird irdVar2 = itbVar3.aq;
                int i4 = alog.d;
                irdVar2.l(alsx.a);
                return;
            case 4:
                uxi uxiVar = (uxi) obj;
                if (kpt.a()) {
                    if (uyh.a() && (uxiVar instanceof uwk)) {
                        zai zaiVar = (zai) ((kvw) this.a).W.b();
                        qiu.h(((vco) zaiVar.e.b()).g().h(new ult(zaiVar, 20), zaiVar.b));
                    }
                    ((kvw) this.a).af.getClass();
                    if (!(uxiVar instanceof uwk)) {
                        ((alvg) uwi.a.g().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 96, "GaiaAuthCheckHelper.kt")).q("Gaia auth check found no UserRecoverableError");
                        return;
                    } else {
                        throw null;
                    }
                }
                return;
            case 5:
                String str = (String) yyb.aS((Optional) obj);
                if (str != null) {
                    Object obj4 = this.a;
                    List list = lrp.b;
                    int i5 = ((alsx) list).c;
                    int length = str.length();
                    if (length == 0) {
                        alvw i6 = lrp.a.i();
                        i6.X(alwp.a, "Bugle");
                        ((alvg) i6.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 146, "IdentityDetailsFragmentPeer.kt")).q("Identity details found with 0 length; skipping");
                    } else if (length % i5 != 0) {
                        alvw i7 = lrp.a.i();
                        i7.X(alwp.a, "Bugle");
                        ((alvg) i7.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer", "setIdentityDetailsText", 150, "IdentityDetailsFragmentPeer.kt")).r("Unexpected security key length: %d", length);
                    } else {
                        int i8 = length / i5;
                        alur it = ((alog) list).iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            TextView textView = (TextView) ((lrp) obj4).c.L().findViewById(((Number) it.next()).intValue());
                            int s = arrn.s(i9 + i8, length);
                            String substring = str.substring(i9, s);
                            substring.getClass();
                            textView.setText(substring);
                            if (s < length) {
                                i9 = s;
                            }
                        }
                    }
                    ((lrp) this.a).a().setVisibility(0);
                    return;
                }
                alvw g = lrp.a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) g.h("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragmentPeer$onLoadSecurityKey$1", "onLoaded", 83, "IdentityDetailsFragmentPeer.kt")).q("Identity details not loaded or not present");
                ((lrp) this.a).a().setVisibility(4);
                return;
            case 6:
                ((zhw) this.a).an.ifPresent(new zhp((zhd) obj, 14));
                return;
            case 7:
                ((zhw) this.a).am.ifPresent(new zhp((yfq) obj, 16));
                return;
            case 8:
                ((zhw) this.a).g();
                return;
            case 9:
                whk whkVar = (whk) obj;
                if ((!aczv.x() || !aczv.X()) && actx.f() && ((zkv) this.a).O.b()) {
                    Object obj5 = this.a;
                    if (whkVar != whk.LEGAL_FYI_SEEN && (!aczv.G() || whkVar != whk.OOB_CONSENT)) {
                        z = false;
                    }
                    ((zkv) obj5).j = z;
                    ((alvg) ((alvg) zkv.a.g()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoaded", 562, "RcsSettingsFragmentV2Peer.java")).t("onRcsDefaultOnLoaded, hasRcsDefaultOnConsent: %s", Boolean.valueOf(((zkv) this.a).j));
                    ((zkv) this.a).k();
                    ((zkv) this.a).g();
                    ((zkv) this.a).i();
                    return;
                }
                return;
            case 10:
                wfs wfsVar = (wfs) obj;
                ((aaix) this.a).e.set(Optional.of(wfsVar));
                aaiz aaizVar = ((aaix) this.a).g;
                if (aaizVar != null) {
                    aaizVar.l(Optional.of(wfsVar));
                    return;
                }
                return;
            case 11:
                String str2 = (String) obj;
                AlertDialog alertDialog = ((aaok) this.a).g;
                if (alertDialog != null) {
                    alertDialog.setMessage("Status: ".concat(str2));
                    return;
                }
                return;
            case 12:
                Optional optional2 = (Optional) obj;
                if (((pcl) ((aazh) this.a).h.b()).a()) {
                    whz whzVar = (whz) optional2.orElse(null);
                    if (whzVar == null) {
                        alvw i10 = aazh.a.i();
                        i10.X(alwp.a, "BugleRcs");
                        ((alvg) ((alvg) i10).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer$TermsAndConditionsDataCallback", "onLoaded", 131, "CarrierTosPopupBottomSheetDialogFragmentPeer.java")).q("TermsAndConditionsData is null");
                        aazk aazkVar = ((aazh) this.a).l;
                        if (aazkVar != null) {
                            aazkVar.d();
                            return;
                        }
                        return;
                    }
                    ((TextView) ((aazh) this.a).c.L().findViewById(R.id.carrier_tos_popup_title)).setText(whzVar.d);
                    TextView textView2 = (TextView) ((aazh) this.a).c.L().findViewById(R.id.carrier_tos_popup_text_paragraph);
                    textView2.setText(whzVar.e);
                    ahnz.s(textView2);
                    ahnz.t(textView2);
                    if (whzVar.a >= 2) {
                        TextView textView3 = (TextView) ((aazh) this.a).c.L().findViewById(R.id.carrier_tos_popup_text_sim_info);
                        textView3.setText(((aazh) this.a).c.T(R.string.carrier_tos_popup_sim_info_text, Integer.valueOf(whzVar.b), whzVar.c));
                        textView3.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((Optional) obj).ifPresent(new aauv(this, 6));
                return;
        }
    }
}
