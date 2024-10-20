package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
enum rfo {
    NO_FILE_TRANSFER_BIND_DATA(true),
    UPLOAD_RESUME_SUCCESS(false),
    UPLOAD_RESUME_FAILED(true),
    DOWNLOAD_RESUME_SUCCESS(false),
    DOWNLOAD_RESUME_FAILED(true),
    DOWNLOAD_START_SUCCESS(false),
    DOWNLOAD_START_FAILED(true);

    public final boolean h;

    rfo(boolean z) {
        this.h = z;
    }
}
