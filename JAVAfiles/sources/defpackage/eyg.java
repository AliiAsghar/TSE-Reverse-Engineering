package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ClearSessionIdsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyg implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ eyg(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                return;
            case 1:
                int i2 = dl.a;
                return;
            case 2:
                return;
            case 3:
                ((alwl) ((alwl) inh.a.g()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "onKeyboardOpen", 771, "AccountInputManagerFragmentPeer.java")).q("Committing pending Fragment transaction after keyboard open.");
                return;
            case 4:
                return;
            case 5:
                alwo alwoVar = qot.a;
                return;
            case 6:
                Parcelable.Creator<Action<Void>> creator = ClearSessionIdsAction.CREATOR;
                sng sngVar = new sng();
                sngVar.aj("ClearSessionIdsAction#executeAction-conversations1");
                sngVar.af();
                sngVar.N(-1L);
                sngVar.a().e();
                sng sngVar2 = new sng();
                sngVar2.aj("ClearSessionIdsAction#executeAction-conversations2");
                sngVar2.af();
                sngVar2.v(4);
                sngVar2.X(new qza(i));
                sngVar2.a().e();
                return;
            case 7:
                throw new IllegalArgumentException("Receiving messaging identity doesn't have an RCS identifier");
            case 8:
                CustomUpgradeSteps.lambda$upgradeToVersion13030$0();
                return;
            case 9:
                CustomUpgradeSteps.lambda$upgradeToVersion45000$0();
                return;
            case 10:
                alvi alviVar = uhg.a;
                taz e = ParticipantsTable.e();
                e.w("ParticipantRefresh#refreshDefaultCurrentSelfIds");
                e.g(new ugo(16));
                alog t = e.b().t();
                if (((alsx) t).c != 1) {
                    alvw i3 = uhg.a.i();
                    i3.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 870, "ParticipantRefresh.java")).q("Default self participant not found");
                    return;
                }
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) t.get(0);
                taz e2 = ParticipantsTable.e();
                e2.w("ParticipantRefresh#selfParticipantIdsSameSimSlot");
                e2.g(new tyl(bindData, 14));
                alog f = e2.b().f();
                if (((alsx) f).c != 1) {
                    alvw i4 = uhg.a.i();
                    i4.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 885, "ParticipantRefresh.java")).q("Self participant with subId > -1 and SIM slot same as default self participant not found");
                    return;
                } else {
                    String str = (String) f.get(0);
                    sng sngVar3 = new sng();
                    sngVar3.af();
                    sngVar3.k(str);
                    sngVar3.g(bindData.M());
                    return;
                }
            case 11:
                alvw g = uvf.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 170, "TickleHandlerHelper.java")).q("Prewarm service can finish now");
                return;
            case 12:
                advr.d(RcsAvailabilityLogWorker.e, "%s No default SimSubscriptionInfoFound. Skipping availability update.", "RcsAvailabilityLogWorker");
                return;
            case 13:
                throw new IllegalArgumentException("RCS self identity is not present.");
            case 14:
                throw new IllegalArgumentException("RCS self identity is not present.");
            case 15:
                ((alvg) ((alvg) wet.a.i()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 170, "PhoneChannelAwaker.java")).q("Self identity is not found for conversation while pre-warming on message sending.");
                return;
            case 16:
                ((alvg) ((alvg) wet.a.i()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onTyping", 108, "PhoneChannelAwaker.java")).q("Self identity is not found for conversation while pre-warning on typing.");
                return;
            case 17:
            case 18:
                return;
            case 19:
                ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "startPlayback", 154, "PlaybackSession.java")).q("Future cancelled after playback started");
                return;
            default:
                ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "preparePlayer", 116, "PlaybackSession.java")).q("Future cancelled before playback started");
                return;
        }
    }
}
