package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mla implements agnp {
    private final /* synthetic */ int a;

    public /* synthetic */ mla(int i) {
        this.a = i;
    }

    @Override // defpackage.agnp
    public final akrh a() {
        switch (this.a) {
            case 0:
                return aktp.e("MessageStatusController::failUndeliveredMessagesWithLogAndThenAttemptFallback");
            case 1:
                return aktp.e("MessageStatusController::failAndThenFallback");
            case 2:
                int i = mux.b;
                return aktp.e("MCQL::onChangeInTransaction::runAfterCommit");
            case 3:
                int i2 = mvx.c;
                return aktp.e("MessageAnnotationChangeQueryListener::onChangeInTransaction::runAfterCommit");
            case 4:
                int i3 = nao.b;
                return aktp.e("MPSCQL::onChangeInTransaction::runAfterCommit");
            case 5:
                int i4 = nav.c;
                return aktp.e("PMCQL::onChangeInTransaction::runAfterCommit");
            case 6:
                int i5 = nbo.c;
                return aktp.e("ReadReportChangeQueryListener::onChangeInTransaction::runAfterCommit");
            case 7:
                return aktp.e("PCQL::handleChange::runAfterCommit");
            case 8:
                xze xzeVar = qif.a;
                return aktp.e("CSDS::notifyBnrSettingsUi::runAfterCommit");
            case 9:
                xze xzeVar2 = qif.a;
                return aktp.e("CSDS::notifyAppSettingsUi::runAfterCommit");
            case 10:
                return aktp.e("LAM::setLinkedAccount::runAfterCommit");
            case 11:
                return aktp.e("logNsfToClearcut");
            case 12:
                xze xzeVar3 = FixupMessageStatusOnStartupAction.a;
                return aktp.e("FMSOSA::deleteOutputUriForAllProcessingPartsAndMarkAsNull::runAfterCommit");
            case 13:
                alwo alwoVar = rat.a;
                return aktp.e("InsertNewMessageProcessor::queueNotificationSyncInSiloExecution");
            case 14:
                return aktp.e("RCMPC::downloadRichCardMediaParts::runAfterCommit");
            case 15:
                xze xzeVar4 = UpdateAttachmentAfterResizingAction.a;
                return aktp.e("UAARA::deleteContent1::runAfterCommit");
            case 16:
                xze xzeVar5 = UpdateAttachmentAfterResizingAction.a;
                return aktp.e("UAARA::deleteContent2::runAfterCommit");
            case 17:
                return aktp.e("ConversationCreationNotifier::runAfterCommit");
            case 18:
                return aktp.e("CMDO::runRefreshConversationMetadata::runAfterCommit");
            case 19:
                return aktp.e("notifyConversationPushAfterCommit");
            default:
                return aktp.e("MCDI::onPartInsertedSync::runAfterCommit");
        }
    }
}
