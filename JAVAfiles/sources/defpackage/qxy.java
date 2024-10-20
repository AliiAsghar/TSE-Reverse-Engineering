package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.MediaScratchFileProvider;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxy extends uhl {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        vpv eJ();
    }

    private final boolean l() {
        return ((a) akec.w(getContext(), a.class)).eJ().a(Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uhl, defpackage.uhk
    public final File a(String str, String str2) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getFile", 61, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
            return null;
        }
        return super.a(str, str2);
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "delete", 85, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
            return 0;
        }
        return super.delete(uri, str, strArr);
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getType", 137, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "insert", 114, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "openFile", 97, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
            return null;
        }
        if (true == "w".equals(str)) {
            str = "wt";
        }
        return super.openFile(uri, str);
    }

    @Override // defpackage.uhl, defpackage.uhk, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 74, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
            return null;
        }
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!l()) {
            alvw i = MediaScratchFileProvider.a.i();
            i.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "update", 125, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return 0;
    }
}
