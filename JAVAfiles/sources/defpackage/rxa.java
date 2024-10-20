package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rxa implements agnp {
    private final /* synthetic */ int a;

    public /* synthetic */ rxa(int i) {
        this.a = i;
    }

    @Override // defpackage.agnp
    public final akrh a() {
        switch (this.a) {
            case 0:
                return aktp.e("MPDO::onPartUpdated::runAfterCommit");
            case 1:
                return aktp.e("BDOI::onPartInsertedSync::runAfterCommit");
            case 2:
                return aktp.e("OnParticipantInsertedProxy#afterParticipantInserted");
            case 3:
                alhr alhrVar = rxz.a;
                return aktp.e("UBPAC::afterParticipantInConversationChanged::runAfterCommit");
            case 4:
                alhr alhrVar2 = rxz.a;
                return aktp.e("UBPAC::afterParticipantSendDestinationUpdated::runAfterCommit");
            case 5:
                int i = rzc.b;
                return aktp.e("UsageStatisticsImpl::logMessageSentOrReceivedInSiloExecution");
            case 6:
                alhr alhrVar3 = uhj.a;
                return aktp.e("DCN::notifyDesktopsChanged::runAfterCommit");
            case 7:
                alhr alhrVar4 = uhj.a;
                return aktp.e("DCN::notifyConversationListChanged::runAfterCommit");
            case 8:
                return aktp.e("UMPARH::deleteContent1::runAfterCommit");
            case 9:
                return aktp.e("UMPARH::deleteContent2::runAfterCommit");
            case 10:
                return aktp.e("StatusTracker::updateStatus");
            case 11:
                return aktp.e("ExecutionState::runAfterCommit");
            case 12:
                return aktp.e("WorkQueueWorkManagerScheduler::markQueueAsScheduled");
            case 13:
                uuf uufVar = vqw.c;
                return aktp.e("RUI::attachmentsChanged::runAfterCommit");
            case 14:
                alwo alwoVar = vum.a;
                return aktp.e("MARGALH::notifyConversationMetadataChanged::runAfterCommit");
            case 15:
                alwo alwoVar2 = xxh.a;
                return aktp.e("DestinationBlocker::updateBugleDbBlockList::runAfterCommit");
            case 16:
                alwo alwoVar3 = xxh.a;
                return aktp.e("DestinationBlocker::updateBlockLists::runAfterCommit");
            case 17:
                alwo alwoVar4 = xxh.a;
                return aktp.e("DestinationBlocker#updateBlockStatus#runAfterCommit");
            case 18:
                alwo alwoVar5 = xxh.a;
                return aktp.e("DestinationBlocker::notifyParticipantsChanged1::runAfterCommit");
            default:
                alvi alviVar = ymh.a;
                return aktp.e("SpamReporter#updateAndReportSpamStatus#runAfterCommit");
        }
    }
}
