package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vhu {
    INCOMING_MESSAGE(0, "Incoming Message Notification"),
    INCOMING_MESSAGE_FOR_SECONDARY_USER(1, "Incoming Message for Secondary User"),
    MESSAGE_FAILURE(2, "Message Failure"),
    LOW_STORAGE_SPACE(3, "Low Storage Space"),
    SIM_STORAGE_FULL(4, "SIM Storage Full"),
    MEDIA_RESIZING(5, "Media Resizing"),
    DIAGNOSTICS_TOOL(8, "In-App Diagnostics"),
    EXHAUSTED_STORAGE_SPACE(9, "Storage Exhausted"),
    REMINDER(10, "Reminder Notification"),
    FOREGROUND_SERVICE(11, "Foreground Service Notification"),
    REPORT_ISSUE(12, "Report Issue"),
    STUCK_MESSAGES(13, "Stuck Messages"),
    AUTOMOVED_SPAM(14, "Auto-Moved Spam"),
    DASHER_DISABLED(15, "Dasher account disabled"),
    PRIMARY_DEVICE_CHANGED_MD(16, "Primary device changed - Multi-Device"),
    ACCOUNT_REMOVED(17, "Account removed"),
    DATA_DONATION(18, "Data Donation"),
    CMS_SYNC_FOREGROUND_SERVICE(19, "Cms Sync Foreground Service Notification"),
    SATELLITE_INCOMING_MESSAGE(20, "Satellite Incoming Message Notification"),
    SATELLITE_STATUS(21, "Satellite Status Notification"),
    CMS_VITAL_ERROR(22, "Cms Vital Error Notification"),
    SATELLITE_MESSAGE_SEND_FAILURE(23, "Satellite Message Send Failure"),
    RCS_NOT_DELIVERED(24, "RCS Not Delivered Notification"),
    BUSINESS_MESSAGES(25, "Business Messages"),
    RCS_STILL_SENDING(26, "RCS Still Sending Notification"),
    PRIMARY_DEVICE_CHANGED_BNR(27, "Primary device changed - Backup & Restore"),
    BACKUP_DELETED_MD(28, "Cloud backup deleted - Multi-Device"),
    BACKUP_DELETED_BNR(29, "Cloud backup deleted - Backup & Restore"),
    UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD(30, "Unspecified PD enforcement - Multi-Device"),
    UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR(31, "Unspecified PD enforcement - Backup & Restore"),
    GAIA_PAIRING_VERIFICATION(32, "Gaia Pairing Verification Notification");

    public final int F;
    public final String G;

    vhu(int i, String str) {
        this.F = i;
        this.G = str;
    }
}
