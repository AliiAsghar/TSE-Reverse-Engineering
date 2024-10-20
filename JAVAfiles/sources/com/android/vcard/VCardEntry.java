package com.android.vcard;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.albo;
import defpackage.anna;
import defpackage.hiy;
import defpackage.hiz;
import defpackage.hja;
import defpackage.hjb;
import defpackage.hjf;
import defpackage.hjg;
import defpackage.hjh;
import defpackage.hji;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardEntry {
    private static final int DEFAULT_ORGANIZATION_TYPE = 1;
    private static final int DEFAULT_QUEUE_INIT_CAPACITY = 10;
    private static final String LOG_TAG = "vCard";
    private static final List<String> sEmptyList;
    private static final Map<String, Integer> sImMap;
    private final Account mAccount;
    private List<AndroidCustomData> mAndroidCustomDataList;
    private AnniversaryData mAnniversary;
    private BirthdayData mBirthday;
    private List<VCardEntry> mChildren;
    private List<EmailData> mEmailList;
    private List<ImData> mImList;
    private final NameData mNameData;
    private List<NicknameData> mNicknameList;
    private List<NoteData> mNoteList;
    private List<OrganizationData> mOrganizationList;
    private List<PhoneData> mPhoneList;
    private List<PhotoData> mPhotoList;
    private List<PostalData> mPostalList;
    private List<SipData> mSipList;
    private List<Pair<String, String>> mUnknownXData;
    private final int mVCardType;
    private List<WebsiteData> mWebsiteList;
    private final hjh prefComparator;
    private final PriorityQueue<hji> preferredEmailPQueue;
    private final PriorityQueue<hji> preferredImPQueue;
    private final PriorityQueue<hji> preferredOrganizationPQueue;
    private final PriorityQueue<hji> preferredPhonePQueue;
    private final PriorityQueue<hji> preferredPhotoPQueue;
    private final PriorityQueue<hji> preferredPostalPQueue;
    private final PriorityQueue<hji> preferredSipPQueue;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class AndroidCustomData implements hjg {
        private final List<String> mDataList;
        private final String mMimeType;

        public AndroidCustomData(String str, List<String> list) {
            this.mMimeType = str;
            this.mDataList = list;
        }

        public static AndroidCustomData constructAndroidCustomData(List<String> list) {
            List<String> subList;
            String str = null;
            if (list == null) {
                subList = null;
            } else if (list.size() < 2) {
                str = list.get(0);
                subList = null;
            } else {
                int min = Math.min(list.size(), 16);
                String str2 = list.get(0);
                subList = list.subList(1, min);
                str = str2;
            }
            return new AndroidCustomData(str, subList);
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", this.mMimeType);
            int i2 = 0;
            while (i2 < this.mDataList.size()) {
                int i3 = i2 + 1;
                String str = this.mDataList.get(i2);
                if (!TextUtils.isEmpty(str)) {
                    newInsert.withValue(a.bV(i3, GroupManagementRequest.DATA_TAG), str);
                }
                i2 = i3;
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AndroidCustomData)) {
                return false;
            }
            AndroidCustomData androidCustomData = (AndroidCustomData) obj;
            if (!TextUtils.equals(this.mMimeType, androidCustomData.mMimeType)) {
                return false;
            }
            List<String> list = this.mDataList;
            if (list == null) {
                if (androidCustomData.mDataList == null) {
                    return true;
                }
                return false;
            }
            int size = list.size();
            if (size != androidCustomData.mDataList.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!TextUtils.equals(this.mDataList.get(i), androidCustomData.mDataList.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public List<String> getDataList() {
            return this.mDataList;
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.ANDROID_CUSTOM;
        }

        public String getMimeType() {
            return this.mMimeType;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.mMimeType;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            List<String> list = this.mDataList;
            if (list != null) {
                for (String str2 : list) {
                    int i3 = i * 31;
                    if (str2 != null) {
                        i2 = str2.hashCode();
                    } else {
                        i2 = 0;
                    }
                    i = i3 + i2;
                }
            }
            return i;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            List<String> list;
            if (!TextUtils.isEmpty(this.mMimeType) && (list = this.mDataList) != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        public String toString() {
            String arrays;
            StringBuilder sb = new StringBuilder("android-custom: ");
            sb.append(this.mMimeType);
            sb.append(", data: ");
            List<String> list = this.mDataList;
            if (list == null) {
                arrays = "null";
            } else {
                arrays = Arrays.toString(list.toArray());
            }
            sb.append(arrays);
            return sb.toString();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class AnniversaryData implements hjg {
        private final String mAnniversary;

        public AnniversaryData(String str) {
            this.mAnniversary = str;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/contact_event");
            newInsert.withValue("data1", this.mAnniversary);
            newInsert.withValue("data2", 1);
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnniversaryData)) {
                return false;
            }
            return TextUtils.equals(this.mAnniversary, ((AnniversaryData) obj).mAnniversary);
        }

        public String getAnniversary() {
            return this.mAnniversary;
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.ANNIVERSARY;
        }

        public int hashCode() {
            String str = this.mAnniversary;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mAnniversary);
        }

        public String toString() {
            return "anniversary: ".concat(String.valueOf(this.mAnniversary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class BirthdayData implements hjg {
        private final String mBirthday;

        public BirthdayData(String str) {
            this.mBirthday = str;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/contact_event");
            newInsert.withValue("data1", this.mBirthday);
            newInsert.withValue("data2", 3);
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BirthdayData)) {
                return false;
            }
            return TextUtils.equals(this.mBirthday, ((BirthdayData) obj).mBirthday);
        }

        public String getBirthday() {
            return this.mBirthday;
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.BIRTHDAY;
        }

        public int hashCode() {
            String str = this.mBirthday;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mBirthday);
        }

        public String toString() {
            return "birthday: ".concat(String.valueOf(this.mBirthday));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class EmailData implements hjg, hji {
        private final int appearanceOrder;
        private final String mAddress;
        private boolean mIsPrimary;
        private final String mLabel;
        private final int mType;
        private int pref = 100;

        public EmailData(String str, int i, String str2, boolean z, int i2) {
            this.mType = i;
            this.mAddress = str;
            this.mLabel = str2;
            this.mIsPrimary = z;
            this.appearanceOrder = i2;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/email_v2");
            newInsert.withValue("data2", Integer.valueOf(this.mType));
            if (this.mType == 0) {
                newInsert.withValue("data3", this.mLabel);
            }
            newInsert.withValue("data1", this.mAddress);
            if (this.mIsPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmailData)) {
                return false;
            }
            EmailData emailData = (EmailData) obj;
            if (this.mType == emailData.mType && TextUtils.equals(this.mAddress, emailData.mAddress) && TextUtils.equals(this.mLabel, emailData.mLabel) && this.mIsPrimary == emailData.mIsPrimary) {
                return true;
            }
            return false;
        }

        public String getAddress() {
            return this.mAddress;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.EMAIL;
        }

        public String getLabel() {
            return this.mLabel;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public int getType() {
            return this.mType;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.mAddress;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = this.mType;
            String str2 = this.mLabel;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i5 = (i4 * 31) + i;
            if (true != this.mIsPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            return (((i5 * 31) + i3) * 31) + i2;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mAddress);
        }

        public boolean isPrimary() {
            return this.mIsPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.mIsPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("type: %d, data: %s, label: %s, isPrimary: %s", Integer.valueOf(this.mType), this.mAddress, this.mLabel, Boolean.valueOf(this.mIsPrimary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface EntryElementIterator {
        boolean onElement(hjg hjgVar);

        void onElementGroupEnded();

        void onElementGroupStarted(EntryLabel entryLabel);

        void onIterationEnded();

        void onIterationStarted();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum EntryLabel {
        NAME,
        PHONE,
        EMAIL,
        POSTAL_ADDRESS,
        ORGANIZATION,
        IM,
        PHOTO,
        WEBSITE,
        SIP,
        NICKNAME,
        NOTE,
        BIRTHDAY,
        ANNIVERSARY,
        ANDROID_CUSTOM
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class ImData implements hjg, hji {
        private final String address;
        private final int appearanceOrder;
        private final String customProtocol;
        private boolean isPrimary;
        private int pref = 100;
        private final int protocol;
        private final int type;

        public ImData(int i, String str, String str2, int i2, boolean z, int i3) {
            this.protocol = i;
            this.customProtocol = str;
            this.type = i2;
            this.address = str2;
            this.isPrimary = z;
            this.appearanceOrder = i3;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/im");
            newInsert.withValue("data2", Integer.valueOf(this.type));
            newInsert.withValue("data5", Integer.valueOf(this.protocol));
            newInsert.withValue("data1", this.address);
            if (this.protocol == -1) {
                newInsert.withValue("data6", this.customProtocol);
            }
            if (this.isPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImData)) {
                return false;
            }
            ImData imData = (ImData) obj;
            if (this.type == imData.type && this.protocol == imData.protocol && TextUtils.equals(this.customProtocol, imData.customProtocol) && TextUtils.equals(this.address, imData.address) && this.isPrimary == imData.isPrimary) {
                return true;
            }
            return false;
        }

        public String getAddress() {
            return this.address;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        public String getCustomProtocol() {
            return this.customProtocol;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.IM;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public int getProtocol() {
            return this.protocol;
        }

        public int getType() {
            return this.type;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.customProtocol;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = this.type;
            int i5 = this.protocol;
            String str2 = this.address;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i6 = (((i4 * 31) + i5) * 31) + i;
            if (true != this.isPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            return (((i6 * 31) + i3) * 31) + i2;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.address);
        }

        public boolean isPrimary() {
            return this.isPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.isPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("type: %d, protocol: %d, custom_protcol: %s, data: %s, isPrimary: %s", Integer.valueOf(this.type), Integer.valueOf(this.protocol), this.customProtocol, this.address, Boolean.valueOf(this.isPrimary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class NameData implements hjg {
        public String displayName;
        private String mFamily;
        private String mFormatted;
        private String mGiven;
        private String mMiddle;
        private String mPhoneticFamily;
        private String mPhoneticGiven;
        private String mPhoneticMiddle;
        private String mPrefix;
        private String mSortString;
        private String mSuffix;
        private final PriorityQueue<hji> preferredNamePQ = new PriorityQueue<>(10, new hjh());

        private void updateFormattedName() {
            if (!this.preferredNamePQ.isEmpty()) {
                this.mFormatted = ((hiy) this.preferredNamePQ.peek()).a;
            }
        }

        public void addFormattedName(hiy hiyVar) {
            this.preferredNamePQ.add(hiyVar);
            updateFormattedName();
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            boolean z;
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(this.mGiven)) {
                newInsert.withValue("data2", this.mGiven);
            }
            if (!TextUtils.isEmpty(this.mFamily)) {
                newInsert.withValue("data3", this.mFamily);
            }
            if (!TextUtils.isEmpty(this.mMiddle)) {
                newInsert.withValue("data5", this.mMiddle);
            }
            if (!TextUtils.isEmpty(this.mPrefix)) {
                newInsert.withValue("data4", this.mPrefix);
            }
            if (!TextUtils.isEmpty(this.mSuffix)) {
                newInsert.withValue("data6", this.mSuffix);
            }
            boolean z2 = true;
            if (!TextUtils.isEmpty(this.mPhoneticGiven)) {
                newInsert.withValue("data7", this.mPhoneticGiven);
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(this.mPhoneticFamily)) {
                newInsert.withValue("data9", this.mPhoneticFamily);
            } else {
                z2 = z;
            }
            if (!TextUtils.isEmpty(this.mPhoneticMiddle)) {
                newInsert.withValue("data8", this.mPhoneticMiddle);
            } else if (!z2) {
                newInsert.withValue("data7", this.mSortString);
            }
            newInsert.withValue("data1", this.displayName);
            list.add(newInsert.build());
        }

        public boolean emptyPhoneticStructuredName() {
            if (TextUtils.isEmpty(this.mPhoneticFamily) && TextUtils.isEmpty(this.mPhoneticGiven) && TextUtils.isEmpty(this.mPhoneticMiddle)) {
                return true;
            }
            return false;
        }

        public boolean emptyStructuredName() {
            if (TextUtils.isEmpty(this.mFamily) && TextUtils.isEmpty(this.mGiven) && TextUtils.isEmpty(this.mMiddle) && TextUtils.isEmpty(this.mPrefix) && TextUtils.isEmpty(this.mSuffix)) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameData)) {
                return false;
            }
            NameData nameData = (NameData) obj;
            if (TextUtils.equals(this.mFamily, nameData.mFamily) && TextUtils.equals(this.mMiddle, nameData.mMiddle) && TextUtils.equals(this.mGiven, nameData.mGiven) && TextUtils.equals(this.mPrefix, nameData.mPrefix) && TextUtils.equals(this.mSuffix, nameData.mSuffix) && TextUtils.equals(this.mFormatted, nameData.mFormatted) && TextUtils.equals(this.mPhoneticFamily, nameData.mPhoneticFamily) && TextUtils.equals(this.mPhoneticMiddle, nameData.mPhoneticMiddle) && TextUtils.equals(this.mPhoneticGiven, nameData.mPhoneticGiven) && TextUtils.equals(this.mSortString, nameData.mSortString)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.NAME;
        }

        public String getFamily() {
            return this.mFamily;
        }

        public String getFormatted() {
            return this.mFormatted;
        }

        public String getGiven() {
            return this.mGiven;
        }

        public String getMiddle() {
            return this.mMiddle;
        }

        public int getPreferredNamesCount() {
            return this.preferredNamePQ.size();
        }

        public String getPrefix() {
            return this.mPrefix;
        }

        public String getSortString() {
            return this.mSortString;
        }

        public String getSuffix() {
            return this.mSuffix;
        }

        public int hashCode() {
            int i;
            String[] strArr = {this.mFamily, this.mMiddle, this.mGiven, this.mPrefix, this.mSuffix, this.mFormatted, this.mPhoneticFamily, this.mPhoneticMiddle, this.mPhoneticGiven, this.mSortString};
            int i2 = 0;
            for (int i3 = 0; i3 < 10; i3++) {
                String str = strArr[i3];
                int i4 = i2 * 31;
                if (str != null) {
                    i = str.hashCode();
                } else {
                    i = 0;
                }
                i2 = i4 + i;
            }
            return i2;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            if (TextUtils.isEmpty(this.mFamily) && TextUtils.isEmpty(this.mMiddle) && TextUtils.isEmpty(this.mGiven) && TextUtils.isEmpty(this.mPrefix) && TextUtils.isEmpty(this.mSuffix) && TextUtils.isEmpty(this.mFormatted) && TextUtils.isEmpty(this.mPhoneticFamily) && TextUtils.isEmpty(this.mPhoneticMiddle) && TextUtils.isEmpty(this.mPhoneticGiven) && TextUtils.isEmpty(this.mSortString)) {
                return true;
            }
            return false;
        }

        public void setFamily(String str) {
            this.mFamily = str;
        }

        public void setGiven(String str) {
            this.mGiven = str;
        }

        public void setMiddle(String str) {
            this.mMiddle = str;
        }

        public void setPrefix(String str) {
            this.mPrefix = str;
        }

        public void setSuffix(String str) {
            this.mSuffix = str;
        }

        public String toString() {
            return String.format("family: %s, given: %s, middle: %s, prefix: %s, suffix: %s", this.mFamily, this.mGiven, this.mMiddle, this.mPrefix, this.mSuffix);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class NicknameData implements hjg {
        private final String mNickname;

        public NicknameData(String str) {
            this.mNickname = str;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/nickname");
            newInsert.withValue("data2", 1);
            newInsert.withValue("data1", this.mNickname);
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NicknameData)) {
                return false;
            }
            return TextUtils.equals(this.mNickname, ((NicknameData) obj).mNickname);
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.NICKNAME;
        }

        public String getNickname() {
            return this.mNickname;
        }

        public int hashCode() {
            String str = this.mNickname;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mNickname);
        }

        public String toString() {
            return "nickname: ".concat(String.valueOf(this.mNickname));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class NoteData implements hjg {
        public final String mNote;

        public NoteData(String str) {
            this.mNote = str;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/note");
            newInsert.withValue("data1", this.mNote);
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteData)) {
                return false;
            }
            return TextUtils.equals(this.mNote, ((NoteData) obj).mNote);
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.NOTE;
        }

        public String getNote() {
            return this.mNote;
        }

        public int hashCode() {
            String str = this.mNote;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mNote);
        }

        public String toString() {
            return "note: ".concat(String.valueOf(this.mNote));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class OrganizationData implements hjg, hji {
        private final int appearanceOrder;
        private String departmentName;
        private boolean isPrimary;
        private String organizationName;
        private final String phoneticName;
        private int pref = 100;
        private String title;
        private final int type;

        public OrganizationData(String str, String str2, String str3, String str4, int i, boolean z, int i2) {
            this.type = i;
            this.organizationName = str;
            this.departmentName = str2;
            this.title = str3;
            this.phoneticName = str4;
            this.isPrimary = z;
            this.appearanceOrder = i2;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/organization");
            newInsert.withValue("data2", Integer.valueOf(this.type));
            String str = this.organizationName;
            if (str != null) {
                newInsert.withValue("data1", str);
            }
            String str2 = this.departmentName;
            if (str2 != null) {
                newInsert.withValue("data5", str2);
            }
            String str3 = this.title;
            if (str3 != null) {
                newInsert.withValue("data4", str3);
            }
            String str4 = this.phoneticName;
            if (str4 != null) {
                newInsert.withValue("data8", str4);
            }
            if (this.isPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrganizationData)) {
                return false;
            }
            OrganizationData organizationData = (OrganizationData) obj;
            if (this.type == organizationData.type && TextUtils.equals(this.organizationName, organizationData.organizationName) && TextUtils.equals(this.departmentName, organizationData.departmentName) && TextUtils.equals(this.title, organizationData.title) && this.isPrimary == organizationData.isPrimary) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        public String getDepartmentName() {
            return this.departmentName;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.ORGANIZATION;
        }

        public String getFormattedString() {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.organizationName)) {
                sb.append(this.organizationName);
            }
            if (!TextUtils.isEmpty(this.departmentName)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.departmentName);
            }
            if (!TextUtils.isEmpty(this.title)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(this.title);
            }
            return sb.toString();
        }

        public String getOrganizationName() {
            return this.organizationName;
        }

        public String getPhoneticName() {
            return this.phoneticName;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public String getTitle() {
            return this.title;
        }

        public int getType() {
            return this.type;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            String str = this.organizationName;
            int i4 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = this.type;
            String str2 = this.departmentName;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 * 31) + i;
            String str3 = this.title;
            if (str3 != null) {
                i4 = str3.hashCode();
            }
            int i7 = ((((i6 * 31) + i2) * 31) + i4) * 31;
            if (true != this.isPrimary) {
                i3 = 1237;
            } else {
                i3 = 1231;
            }
            return i7 + i3;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            if (TextUtils.isEmpty(this.organizationName) && TextUtils.isEmpty(this.departmentName) && TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.phoneticName)) {
                return true;
            }
            return false;
        }

        public boolean isPrimary() {
            return this.isPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.isPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("type: %d, organization: %s, department: %s, title: %s, isPrimary: %s", Integer.valueOf(this.type), this.organizationName, this.departmentName, this.title, Boolean.valueOf(this.isPrimary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class PhoneData implements hjg, hji {
        private final int appearanceOrder;
        private boolean mIsPrimary;
        private final String mLabel;
        private final String mNumber;
        private final int mType;
        private int pref = 100;

        public PhoneData(String str, int i, String str2, boolean z, int i2) {
            this.mNumber = str;
            this.mType = i;
            this.mLabel = str2;
            this.mIsPrimary = z;
            this.appearanceOrder = i2;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/phone_v2");
            newInsert.withValue("data2", Integer.valueOf(this.mType));
            if (this.mType == 0) {
                newInsert.withValue("data3", this.mLabel);
            }
            newInsert.withValue("data1", this.mNumber);
            if (this.mIsPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneData)) {
                return false;
            }
            PhoneData phoneData = (PhoneData) obj;
            if (this.mType == phoneData.mType && TextUtils.equals(this.mNumber, phoneData.mNumber) && TextUtils.equals(this.mLabel, phoneData.mLabel) && this.mIsPrimary == phoneData.mIsPrimary) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.PHONE;
        }

        public String getLabel() {
            return this.mLabel;
        }

        public String getNumber() {
            return this.mNumber;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public int getType() {
            return this.mType;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.mNumber;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = this.mType;
            String str2 = this.mLabel;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i5 = (i4 * 31) + i;
            if (true != this.mIsPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            return (((i5 * 31) + i3) * 31) + i2;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mNumber);
        }

        public boolean isPrimary() {
            return this.mIsPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.mIsPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("type: %d, data: %s, label: %s, isPrimary: %s", Integer.valueOf(this.mType), this.mNumber, this.mLabel, Boolean.valueOf(this.mIsPrimary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class PhotoData implements hjg, hji {
        private final int appearanceOrder;
        private final byte[] bytes;
        private final String format;
        private boolean isPrimary;
        private Integer hashCode = null;
        private int pref = 100;

        public PhotoData(String str, byte[] bArr, boolean z, int i) {
            this.format = str;
            this.bytes = bArr;
            this.isPrimary = z;
            this.appearanceOrder = i;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/photo");
            newInsert.withValue("data15", this.bytes);
            if (this.isPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoData)) {
                return false;
            }
            PhotoData photoData = (PhotoData) obj;
            if (TextUtils.equals(this.format, photoData.format) && Arrays.equals(this.bytes, photoData.bytes) && this.isPrimary == photoData.isPrimary) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        public byte[] getBytes() {
            return this.bytes;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.PHOTO;
        }

        public String getFormat() {
            return this.format;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public int hashCode() {
            int i;
            int i2;
            Integer num = this.hashCode;
            if (num != null) {
                return num.intValue();
            }
            String str = this.format;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            byte[] bArr = this.bytes;
            int i3 = i * 31;
            if (bArr != null) {
                for (byte b : bArr) {
                    i3 += b;
                }
            }
            int i4 = i3 * 31;
            if (true != this.isPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            int i5 = i4 + i2;
            this.hashCode = Integer.valueOf(i5);
            return i5;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            byte[] bArr = this.bytes;
            if (bArr != null && bArr.length != 0) {
                return false;
            }
            return true;
        }

        public boolean isPrimary() {
            return this.isPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.isPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("format: %s: size: %d, isPrimary: %s", this.format, Integer.valueOf(this.bytes.length), Boolean.valueOf(this.isPrimary));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class PostalData implements hjg, hji {
        private static final int ADDR_MAX_DATA_SIZE = 7;
        private final int appearanceOrder;
        private final String mCountry;
        private final String mExtendedAddress;
        private boolean mIsPrimary;
        private final String mLabel;
        private final String mLocalty;
        private final String mPobox;
        private final String mPostalCode;
        private final String mRegion;
        private final String mStreet;
        private final int mType;
        private final int mVCardType;
        private int pref = 100;

        public PostalData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, int i2, int i3) {
            this.mType = i;
            this.mPobox = str;
            this.mExtendedAddress = str2;
            this.mStreet = str3;
            this.mLocalty = str4;
            this.mRegion = str5;
            this.mPostalCode = str6;
            this.mCountry = str7;
            this.mLabel = str8;
            this.mIsPrimary = z;
            this.mVCardType = i2;
            this.appearanceOrder = i3;
        }

        public static PostalData constructPostalData(List<String> list, int i, String str, boolean z, int i2, int i3) {
            String[] strArr = new String[7];
            int size = list.size();
            if (size > 7) {
                size = 7;
            }
            Iterator<String> it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                strArr[i4] = it.next();
                i4++;
                if (i4 >= size) {
                    break;
                }
            }
            while (i4 < 7) {
                strArr[i4] = null;
                i4++;
            }
            return new PostalData(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5], strArr[6], i, str, z, i2, i3);
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            String str;
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/postal-address_v2");
            newInsert.withValue("data2", Integer.valueOf(this.mType));
            if (this.mType == 0) {
                newInsert.withValue("data3", this.mLabel);
            }
            if (TextUtils.isEmpty(this.mStreet)) {
                if (TextUtils.isEmpty(this.mExtendedAddress)) {
                    str = null;
                } else {
                    str = this.mExtendedAddress;
                }
            } else if (TextUtils.isEmpty(this.mExtendedAddress)) {
                str = this.mStreet;
            } else {
                str = this.mStreet + " " + this.mExtendedAddress;
            }
            newInsert.withValue("data5", this.mPobox);
            newInsert.withValue("data4", str);
            newInsert.withValue("data7", this.mLocalty);
            newInsert.withValue("data8", this.mRegion);
            newInsert.withValue("data9", this.mPostalCode);
            newInsert.withValue("data10", this.mCountry);
            newInsert.withValue("data1", getFormattedAddress());
            if (this.mIsPrimary) {
                newInsert.withValue("is_primary", 1);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostalData)) {
                return false;
            }
            PostalData postalData = (PostalData) obj;
            int i = this.mType;
            if (i == postalData.mType && ((i != 0 || TextUtils.equals(this.mLabel, postalData.mLabel)) && this.mIsPrimary == postalData.mIsPrimary && TextUtils.equals(this.mPobox, postalData.mPobox) && TextUtils.equals(this.mExtendedAddress, postalData.mExtendedAddress) && TextUtils.equals(this.mStreet, postalData.mStreet) && TextUtils.equals(this.mLocalty, postalData.mLocalty) && TextUtils.equals(this.mRegion, postalData.mRegion) && TextUtils.equals(this.mPostalCode, postalData.mPostalCode) && TextUtils.equals(this.mCountry, postalData.mCountry))) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        public String getCountry() {
            return this.mCountry;
        }

        @Override // defpackage.hjg
        public final EntryLabel getEntryLabel() {
            return EntryLabel.POSTAL_ADDRESS;
        }

        public String getExtendedAddress() {
            return this.mExtendedAddress;
        }

        public String getFormattedAddress() {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {this.mPobox, this.mExtendedAddress, this.mStreet, this.mLocalty, this.mRegion, this.mPostalCode, this.mCountry};
            boolean z = true;
            if (VCardConfig.isJapaneseDevice(this.mVCardType)) {
                for (int i = 6; i >= 0; i--) {
                    String str = strArr[i];
                    if (!TextUtils.isEmpty(str)) {
                        if (!z) {
                            sb.append(' ');
                        }
                        sb.append(str);
                        z = false;
                    }
                }
            } else {
                for (int i2 = 0; i2 < 7; i2++) {
                    String str2 = strArr[i2];
                    if (!TextUtils.isEmpty(str2)) {
                        if (!z) {
                            sb.append(' ');
                        }
                        sb.append(str2);
                        z = false;
                    }
                }
            }
            return sb.toString().trim();
        }

        public String getLabel() {
            return this.mLabel;
        }

        public String getLocalty() {
            return this.mLocalty;
        }

        public String getPobox() {
            return this.mPobox;
        }

        public String getPostalCode() {
            return this.mPostalCode;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public String getRegion() {
            return this.mRegion;
        }

        public String getStreet() {
            return this.mStreet;
        }

        public int getType() {
            return this.mType;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            String str = this.mLabel;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = this.mType;
            if (true != this.mIsPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            int i5 = (i4 * 31) + i;
            String[] strArr = {this.mPobox, this.mExtendedAddress, this.mStreet, this.mLocalty, this.mRegion, this.mPostalCode, this.mCountry};
            int i6 = (i5 * 31) + i2;
            for (int i7 = 0; i7 < 7; i7++) {
                String str2 = strArr[i7];
                int i8 = i6 * 31;
                if (str2 != null) {
                    i3 = str2.hashCode();
                } else {
                    i3 = 0;
                }
                i6 = i8 + i3;
            }
            return i6;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            if (TextUtils.isEmpty(this.mPobox) && TextUtils.isEmpty(this.mExtendedAddress) && TextUtils.isEmpty(this.mStreet) && TextUtils.isEmpty(this.mLocalty) && TextUtils.isEmpty(this.mRegion) && TextUtils.isEmpty(this.mPostalCode) && TextUtils.isEmpty(this.mCountry)) {
                return true;
            }
            return false;
        }

        public boolean isPrimary() {
            return this.mIsPrimary;
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.mIsPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return String.format("type: %d, label: %s, isPrimary: %s, pobox: %s, extendedAddress: %s, street: %s, localty: %s, region: %s, postalCode %s, country: %s", Integer.valueOf(this.mType), this.mLabel, Boolean.valueOf(this.mIsPrimary), this.mPobox, this.mExtendedAddress, this.mStreet, this.mLocalty, this.mRegion, this.mPostalCode, this.mCountry);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class SipData implements hjg, hji {
        private final String address;
        private final int appearanceOrder;
        private boolean isPrimary;
        private final String label;
        private int pref = 100;
        private final int type;

        public SipData(String str, int i, String str2, boolean z, int i2) {
            this.address = str.startsWith("sip:") ? str.substring(4) : str;
            this.type = i;
            this.label = str2;
            this.isPrimary = z;
            this.appearanceOrder = i2;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/sip_address");
            newInsert.withValue("data1", this.address);
            newInsert.withValue("data2", Integer.valueOf(this.type));
            if (this.type == 0) {
                newInsert.withValue("data3", this.label);
            }
            if (this.isPrimary) {
                newInsert.withValue("is_primary", true);
            }
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SipData)) {
                return false;
            }
            SipData sipData = (SipData) obj;
            if (this.type == sipData.type && TextUtils.equals(this.label, sipData.label) && TextUtils.equals(this.address, sipData.address) && this.isPrimary == sipData.isPrimary) {
                return true;
            }
            return false;
        }

        public String getAddress() {
            return this.address;
        }

        @Override // defpackage.hji
        public int getAppearanceOrder() {
            return this.appearanceOrder;
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.SIP;
        }

        public String getLabel() {
            return this.label;
        }

        @Override // defpackage.hji
        public int getPref() {
            return this.pref;
        }

        public int getType() {
            return this.type;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.label;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = this.type;
            String str2 = this.address;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i5 = (i4 * 31) + i;
            if (true != this.isPrimary) {
                i2 = 1237;
            } else {
                i2 = 1231;
            }
            return (((i5 * 31) + i3) * 31) + i2;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.address);
        }

        @Override // defpackage.hji
        public void setIsPrimary(boolean z) {
            this.isPrimary = z;
        }

        @Override // defpackage.hji
        public void setPref(int i) {
            this.pref = i;
        }

        public String toString() {
            return "sip: ".concat(String.valueOf(this.address));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class WebsiteData implements hjg {
        private final String mWebsite;

        public WebsiteData(String str) {
            this.mWebsite = str;
        }

        @Override // defpackage.hjg
        public void constructInsertOperation(List<ContentProviderOperation> list, int i) {
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
            newInsert.withValueBackReference("raw_contact_id", i);
            newInsert.withValue("mimetype", "vnd.android.cursor.item/website");
            newInsert.withValue("data1", this.mWebsite);
            newInsert.withValue("data2", 1);
            list.add(newInsert.build());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebsiteData)) {
                return false;
            }
            return TextUtils.equals(this.mWebsite, ((WebsiteData) obj).mWebsite);
        }

        @Override // defpackage.hjg
        public EntryLabel getEntryLabel() {
            return EntryLabel.WEBSITE;
        }

        public String getWebsite() {
            return this.mWebsite;
        }

        public int hashCode() {
            String str = this.mWebsite;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // defpackage.hjg
        public boolean isEmpty() {
            return TextUtils.isEmpty(this.mWebsite);
        }

        public String toString() {
            return "website: ".concat(String.valueOf(this.mWebsite));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sImMap = hashMap;
        hashMap.put(VCardConstants.PROPERTY_X_AIM, 0);
        hashMap.put(VCardConstants.PROPERTY_X_MSN, 1);
        hashMap.put(VCardConstants.PROPERTY_X_YAHOO, 2);
        hashMap.put(VCardConstants.PROPERTY_X_ICQ, 6);
        hashMap.put(VCardConstants.PROPERTY_X_JABBER, 7);
        hashMap.put(VCardConstants.PROPERTY_X_SKYPE_USERNAME, 3);
        hashMap.put(VCardConstants.PROPERTY_X_GOOGLE_TALK, 5);
        hashMap.put(VCardConstants.ImportOnly.PROPERTY_X_GOOGLE_TALK_WITH_SPACE, 5);
        sEmptyList = DesugarCollections.unmodifiableList(new ArrayList(0));
    }

    public VCardEntry() {
        this(-1073741824);
    }

    private EmailData addEmail(int i, String str, String str2, boolean z) {
        if (this.mEmailList == null) {
            this.mEmailList = new ArrayList();
        }
        EmailData emailData = new EmailData(str, i, str2, z, this.mEmailList.size());
        this.mEmailList.add(emailData);
        return emailData;
    }

    private ImData addIm(int i, String str, String str2, int i2, boolean z) {
        if (this.mImList == null) {
            this.mImList = new ArrayList();
        }
        ImData imData = new ImData(i, str, str2, i2, z, this.mImList.size());
        this.mImList.add(imData);
        return imData;
    }

    private void addNewOrganization(String str, String str2, String str3, String str4, int i, boolean z, Integer num) {
        if (this.mOrganizationList == null) {
            this.mOrganizationList = new ArrayList();
        }
        OrganizationData organizationData = new OrganizationData(str, str2, str3, str4, i, z, this.mOrganizationList.size());
        this.mOrganizationList.add(organizationData);
        if (VCardConfig.isVersion40(this.mVCardType) && num != null) {
            organizationData.setPref(num.intValue());
            this.preferredOrganizationPQueue.add(organizationData);
        }
    }

    private void addNickName(String str) {
        if (this.mNicknameList == null) {
            this.mNicknameList = new ArrayList();
        }
        this.mNicknameList.add(new NicknameData(str));
    }

    private void addNote(String str) {
        if (this.mNoteList == null) {
            this.mNoteList = new ArrayList(1);
        }
        this.mNoteList.add(new NoteData(str));
    }

    private PhoneData addPhone(int i, String str, String str2, boolean z) {
        if (this.mPhoneList == null) {
            this.mPhoneList = new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        String trim = str.trim();
        if (i != 6 && !VCardConfig.refrainPhoneNumberFormatting(this.mVCardType)) {
            int length = trim.length();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                char charAt = trim.charAt(i2);
                if (charAt != 'p' && charAt != 'P') {
                    if (charAt != 'w' && charAt != 'W') {
                        if (charAt < '0' || charAt > '9') {
                            if (i2 == 0) {
                                if (charAt == '+') {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                }
                            }
                            i2++;
                        }
                        sb.append(charAt);
                        i2++;
                    } else {
                        sb.append(';');
                    }
                } else {
                    sb.append(',');
                }
                z2 = true;
                i2++;
            }
            if (!z2) {
                trim = VCardUtils.PhoneNumberUtilsPort.formatNumber(sb.toString(), VCardUtils.getPhoneNumberFormat(this.mVCardType));
            } else {
                trim = sb.toString();
            }
        }
        PhoneData phoneData = new PhoneData(trim, i, str2, z, this.mPhoneList.size());
        this.mPhoneList.add(phoneData);
        return phoneData;
    }

    private PhotoData addPhotoBytes(String str, byte[] bArr, boolean z) {
        if (this.mPhotoList == null) {
            this.mPhotoList = new ArrayList(1);
        }
        PhotoData photoData = new PhotoData(str, bArr, z, this.mPhotoList.size());
        this.mPhotoList.add(photoData);
        return photoData;
    }

    private PostalData addPostal(int i, List<String> list, String str, boolean z) {
        if (this.mPostalList == null) {
            this.mPostalList = new ArrayList(0);
        }
        PostalData constructPostalData = PostalData.constructPostalData(list, i, str, z, this.mVCardType, this.mPostalList.size());
        this.mPostalList.add(constructPostalData);
        return constructPostalData;
    }

    private SipData addSip(String str, int i, String str2, boolean z) {
        if (this.mSipList == null) {
            this.mSipList = new ArrayList();
        }
        SipData sipData = new SipData(str, i, str2, z, this.mSipList.size());
        this.mSipList.add(sipData);
        return sipData;
    }

    public static VCardEntry buildFromResolver(ContentResolver contentResolver, Uri uri) {
        return null;
    }

    private String buildSinglePhoneticNameFromSortAsParam(Map<String, Collection<String>> map) {
        Collection<String> collection = map.get(VCardConstants.PARAM_SORT_AS);
        if (collection != null && !collection.isEmpty()) {
            if (collection.size() > 1) {
                Log.w("vCard", "Incorrect multiple SORT_AS parameters detected: ".concat(String.valueOf(Arrays.toString(collection.toArray()))));
            }
            List<String> constructListFromValue = VCardUtils.constructListFromValue(collection.iterator().next(), this.mVCardType);
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = constructListFromValue.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            return sb.toString();
        }
        return null;
    }

    private String constructDisplayName() {
        String formattedString;
        if (!TextUtils.isEmpty(this.mNameData.mFormatted)) {
            formattedString = this.mNameData.mFormatted;
        } else if (!this.mNameData.emptyStructuredName()) {
            int i = this.mVCardType;
            NameData nameData = this.mNameData;
            formattedString = VCardUtils.constructNameFromElements(i, nameData.mFamily, nameData.mMiddle, nameData.mGiven, nameData.mPrefix, nameData.mSuffix);
        } else if (!this.mNameData.emptyPhoneticStructuredName()) {
            int i2 = this.mVCardType;
            NameData nameData2 = this.mNameData;
            formattedString = VCardUtils.constructNameFromElements(i2, nameData2.mPhoneticFamily, nameData2.mPhoneticMiddle, nameData2.mPhoneticGiven);
        } else {
            List<EmailData> list = this.mEmailList;
            if (list != null && !list.isEmpty()) {
                formattedString = this.mEmailList.get(0).mAddress;
            } else {
                List<PhoneData> list2 = this.mPhoneList;
                if (list2 != null && !list2.isEmpty()) {
                    formattedString = this.mPhoneList.get(0).mNumber;
                } else {
                    List<PostalData> list3 = this.mPostalList;
                    if (list3 != null && !list3.isEmpty()) {
                        formattedString = this.mPostalList.get(0).getFormattedAddress();
                    } else {
                        List<OrganizationData> list4 = this.mOrganizationList;
                        formattedString = (list4 == null || list4.isEmpty()) ? null : this.mOrganizationList.get(0).getFormattedString();
                    }
                }
            }
        }
        if (formattedString == null) {
            return "";
        }
        return formattedString;
    }

    private Integer getPrefValue(Map<String, Collection<String>> map) {
        Collection<String> collection = map.get("PREF");
        if (collection == null) {
            return null;
        }
        if (collection.size() > 1) {
            Log.w("vCard", "Incorrect multiple PREF parameters detected: ".concat(String.valueOf(Arrays.toString(collection.toArray()))));
        }
        String next = collection.iterator().next();
        try {
            return Integer.valueOf(Integer.parseInt(next));
        } catch (NumberFormatException unused) {
            Log.w("vCard", "Incorrect value of PREF parameter: ".concat(String.valueOf(next)));
            return null;
        }
    }

    private void handleAndroidCustomProperty(List<String> list) {
        if (this.mAndroidCustomDataList == null) {
            this.mAndroidCustomDataList = new ArrayList();
        }
        this.mAndroidCustomDataList.add(AndroidCustomData.constructAndroidCustomData(list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r6 != 5) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleNProperty(java.util.List<java.lang.String> r5, java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> r6) {
        /*
            r4 = this;
            r4.tryHandleSortAsName(r6)
            if (r5 == 0) goto L55
            int r6 = r5.size()
            if (r6 > 0) goto Lc
            goto L55
        Lc:
            r0 = 3
            r1 = 2
            r2 = 4
            r3 = 5
            if (r6 <= r3) goto L13
            goto L1c
        L13:
            if (r6 == r1) goto L3d
            if (r6 == r0) goto L32
            if (r6 == r2) goto L27
            if (r6 == r3) goto L1c
            goto L49
        L1c:
            com.android.vcard.VCardEntry$NameData r6 = r4.mNameData
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.android.vcard.VCardEntry.NameData.m180$$Nest$fputmSuffix(r6, r2)
        L27:
            com.android.vcard.VCardEntry$NameData r6 = r4.mNameData
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.android.vcard.VCardEntry.NameData.m178$$Nest$fputmPrefix(r6, r0)
        L32:
            com.android.vcard.VCardEntry$NameData r6 = r4.mNameData
            java.lang.Object r0 = r5.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.android.vcard.VCardEntry.NameData.m174$$Nest$fputmMiddle(r6, r0)
        L3d:
            com.android.vcard.VCardEntry$NameData r6 = r4.mNameData
            r0 = 1
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.android.vcard.VCardEntry.NameData.m173$$Nest$fputmGiven(r6, r0)
        L49:
            com.android.vcard.VCardEntry$NameData r6 = r4.mNameData
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            com.android.vcard.VCardEntry.NameData.m171$$Nest$fputmFamily(r6, r5)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardEntry.handleNProperty(java.util.List, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleOrgValue(int r9, java.util.List<java.lang.String> r10, java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> r11, boolean r12, java.lang.Integer r13) {
        /*
            r8 = this;
            java.lang.String r4 = r8.buildSinglePhoneticNameFromSortAsParam(r11)
            if (r10 != 0) goto L8
            java.util.List<java.lang.String> r10 = com.android.vcard.VCardEntry.sEmptyList
        L8:
            int r11 = r10.size()
            r0 = 0
            if (r11 == 0) goto L42
            r1 = 0
            r2 = 1
            if (r11 == r2) goto L3b
            java.lang.Object r0 = r10.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = r2
        L1f:
            if (r3 >= r11) goto L34
            if (r3 <= r2) goto L28
            r5 = 32
            r1.append(r5)
        L28:
            java.lang.Object r5 = r10.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            r1.append(r5)
            int r3 = r3 + 1
            goto L1f
        L34:
            java.lang.String r10 = r1.toString()
            r2 = r10
            r1 = r0
            goto L46
        L3b:
            java.lang.Object r10 = r10.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            goto L44
        L42:
            java.lang.String r10 = ""
        L44:
            r1 = r10
            r2 = r0
        L46:
            java.util.List<com.android.vcard.VCardEntry$OrganizationData> r10 = r8.mOrganizationList
            if (r10 != 0) goto L53
            r3 = 0
            r0 = r8
            r5 = r9
            r6 = r12
            r7 = r13
            r0.addNewOrganization(r1, r2, r3, r4, r5, r6, r7)
            return
        L53:
            java.util.Iterator r10 = r10.iterator()
        L57:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L82
            java.lang.Object r11 = r10.next()
            com.android.vcard.VCardEntry$OrganizationData r11 = (com.android.vcard.VCardEntry.OrganizationData) r11
            java.lang.String r0 = com.android.vcard.VCardEntry.OrganizationData.m182$$Nest$fgetorganizationName(r11)
            if (r0 != 0) goto L57
            java.lang.String r0 = com.android.vcard.VCardEntry.OrganizationData.m181$$Nest$fgetdepartmentName(r11)
            if (r0 != 0) goto L57
            com.android.vcard.VCardEntry.OrganizationData.m186$$Nest$fputorganizationName(r11, r1)
            com.android.vcard.VCardEntry.OrganizationData.m184$$Nest$fputdepartmentName(r11, r2)
            com.android.vcard.VCardEntry.OrganizationData.m185$$Nest$fputisPrimary(r11, r12)
            if (r13 == 0) goto L81
            int r9 = r13.intValue()
            com.android.vcard.VCardEntry.OrganizationData.m187$$Nest$fputpref(r11, r9)
        L81:
            return
        L82:
            r3 = 0
            r0 = r8
            r5 = r9
            r6 = r12
            r7 = r13
            r0.addNewOrganization(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardEntry.handleOrgValue(int, java.util.List, java.util.Map, boolean, java.lang.Integer):void");
    }

    private void handlePhoneticNameFromSound(List<String> list) {
        int size;
        if (TextUtils.isEmpty(this.mNameData.mPhoneticFamily) && TextUtils.isEmpty(this.mNameData.mPhoneticMiddle) && TextUtils.isEmpty(this.mNameData.mPhoneticGiven) && list != null && (size = list.size()) > 0) {
            if (size > 3) {
                size = 3;
            }
            if (list.get(0).length() > 0) {
                for (int i = 1; i < size; i++) {
                    if (list.get(i).length() <= 0) {
                    }
                }
                List c = anna.e(' ').c(list.get(0));
                int size2 = c.size();
                if (size2 == 3) {
                    this.mNameData.mPhoneticFamily = (String) c.get(0);
                    this.mNameData.mPhoneticMiddle = (String) c.get(1);
                    this.mNameData.mPhoneticGiven = (String) c.get(2);
                    return;
                } else if (size2 == 2) {
                    this.mNameData.mPhoneticFamily = (String) c.get(0);
                    this.mNameData.mPhoneticGiven = (String) c.get(1);
                    return;
                } else {
                    this.mNameData.mPhoneticGiven = list.get(0);
                    return;
                }
            }
            if (size != 2) {
                if (size == 3) {
                    this.mNameData.mPhoneticMiddle = list.get(2);
                }
                this.mNameData.mPhoneticFamily = list.get(0);
            }
            this.mNameData.mPhoneticGiven = list.get(1);
            this.mNameData.mPhoneticFamily = list.get(0);
        }
    }

    private void handlePhoto(VCardProperty vCardProperty) {
        byte[] byteValue = vCardProperty.getByteValue();
        Map<String, Collection<String>> parameterMap = vCardProperty.getParameterMap();
        Collection<String> collection = parameterMap.get(VCardConstants.PARAM_VALUE);
        if (collection != null && collection.contains(VCardConstants.PROPERTY_URL)) {
            return;
        }
        Collection<String> collection2 = parameterMap.get(VCardConstants.PARAM_TYPE);
        String str = null;
        boolean z = false;
        if (collection2 != null) {
            for (String str2 : collection2) {
                if ("PREF".equals(str2)) {
                    z = true;
                } else if (str == null) {
                    str = str2;
                }
            }
        }
        addPhotoBytes(str, byteValue, z);
    }

    private void handlePrefParameter(Map<String, Collection<String>> map, hji hjiVar, PriorityQueue<hji> priorityQueue) {
        Integer prefValue = getPrefValue(map);
        if (prefValue != null) {
            hjiVar.setPref(prefValue.intValue());
            priorityQueue.add(hjiVar);
        }
    }

    private void handleSipCase(String str, Map<String, Collection<String>> map) {
        boolean z;
        Collection<String> collection = map.get(VCardConstants.PARAM_TYPE);
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("sip:")) {
                str = str.substring(4);
                if (str.length() == 0) {
                    return;
                }
            }
            int i = -1;
            String str2 = null;
            if (collection != null) {
                z = false;
                for (String str3 : collection) {
                    String aq = albo.aq(str3);
                    int i2 = 1;
                    if (aq.equals("PREF")) {
                        z = true;
                    } else {
                        if (!aq.equals(VCardConstants.PARAM_TYPE_HOME)) {
                            i2 = 2;
                            if (!aq.equals(VCardConstants.PARAM_TYPE_WORK)) {
                                if (i < 0) {
                                    if (aq.startsWith("X-")) {
                                        str2 = str3.substring(2);
                                    } else {
                                        str2 = str3;
                                    }
                                    i = 0;
                                }
                            }
                        }
                        i = i2;
                    }
                }
            } else {
                z = false;
            }
            if (i < 0) {
                i = 3;
            }
            if (VCardConfig.isVersion40(this.mVCardType)) {
                handlePrefParameter(map, addSip(str, i, str2, false), this.preferredSipPQueue);
            } else {
                addSip(str, i, str2, z);
            }
        }
    }

    private void handleTitleValue(String str) {
        List<OrganizationData> list = this.mOrganizationList;
        if (list == null) {
            addNewOrganization(null, null, str, null, 1, false, null);
            return;
        }
        for (OrganizationData organizationData : list) {
            if (organizationData.title == null) {
                organizationData.title = str;
                return;
            }
        }
        addNewOrganization(null, null, str, null, 1, false, null);
    }

    private void handleUriPhoto(VCardProperty vCardProperty) {
        Map<String, Collection<String>> parameterMap = vCardProperty.getParameterMap();
        hjf dataUri = vCardProperty.getDataUri();
        if (dataUri != null) {
            handlePrefParameter(parameterMap, addPhotoBytes(dataUri.b, dataUri.c, false), this.preferredPhotoPQueue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iterateAllPreferredElements() {
        setIsPrimaryForUniquePreferredElement(this.preferredPhonePQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredEmailPQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredPostalPQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredOrganizationPQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredImPQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredPhotoPQueue);
        setIsPrimaryForUniquePreferredElement(this.preferredSipPQueue);
    }

    private void iterateOneList(List<? extends hjg> list, EntryElementIterator entryElementIterator) {
        if (list != null && !list.isEmpty()) {
            entryElementIterator.onElementGroupStarted(list.get(0).getEntryLabel());
            Iterator<? extends hjg> it = list.iterator();
            while (it.hasNext()) {
                entryElementIterator.onElement(it.next());
            }
            entryElementIterator.onElementGroupEnded();
        }
    }

    private String listToString(List<String> list) {
        int size = list.size();
        if (size > 1) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(";");
            }
            return sb.toString();
        }
        if (size == 1) {
            return list.get(0);
        }
        return "";
    }

    private void setIsPrimaryForUniquePreferredElement(PriorityQueue<hji> priorityQueue) {
        if (!priorityQueue.isEmpty()) {
            priorityQueue.peek().setIsPrimary(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r0 != 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void tryHandleSortAsName(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> r5) {
        /*
            r4 = this;
            int r0 = r4.mVCardType
            boolean r0 = com.android.vcard.VCardConfig.isVersion30(r0)
            if (r0 == 0) goto L2c
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            java.lang.String r0 = com.android.vcard.VCardEntry.NameData.m166$$Nest$fgetmPhoneticFamily(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9a
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            java.lang.String r0 = com.android.vcard.VCardEntry.NameData.m168$$Nest$fgetmPhoneticMiddle(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9a
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            java.lang.String r0 = com.android.vcard.VCardEntry.NameData.m167$$Nest$fgetmPhoneticGiven(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9a
        L2c:
            java.lang.String r0 = "SORT-AS"
            java.lang.Object r5 = r5.get(r0)
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L9a
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L9a
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L5a
            java.lang.Object[] r0 = r5.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "vCard"
            java.lang.String r3 = "Incorrect multiple SORT_AS parameters detected: "
            java.lang.String r0 = r3.concat(r0)
            android.util.Log.w(r2, r0)
        L5a:
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r5.next()
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r4.mVCardType
            java.util.List r5 = com.android.vcard.VCardUtils.constructListFromValue(r5, r0)
            int r0 = r5.size()
            r2 = 2
            r3 = 3
            if (r0 <= r3) goto L73
            goto L78
        L73:
            if (r0 == r2) goto L83
            if (r0 == r3) goto L78
            goto L8e
        L78:
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.android.vcard.VCardEntry.NameData.m177$$Nest$fputmPhoneticMiddle(r0, r2)
        L83:
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.android.vcard.VCardEntry.NameData.m176$$Nest$fputmPhoneticGiven(r0, r1)
        L8e:
            com.android.vcard.VCardEntry$NameData r0 = r4.mNameData
            r1 = 0
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            com.android.vcard.VCardEntry.NameData.m175$$Nest$fputmPhoneticFamily(r0, r5)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardEntry.tryHandleSortAsName(java.util.Map):void");
    }

    public void addChild(VCardEntry vCardEntry) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(vCardEntry);
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0541 A[Catch: ahvz -> 0x0581, TryCatch #0 {ahvz -> 0x0581, blocks: (B:227:0x0293, B:229:0x029a, B:231:0x02a2, B:237:0x02de, B:239:0x02e4, B:240:0x02e7, B:242:0x02ed, B:243:0x02f1, B:244:0x0341, B:246:0x0349, B:247:0x0350, B:249:0x0356, B:251:0x035d, B:253:0x0363, B:256:0x0370, B:257:0x0378, B:258:0x0379, B:260:0x0385, B:262:0x0393, B:264:0x039a, B:268:0x03a0, B:269:0x03b5, B:272:0x03bd, B:274:0x03c4, B:275:0x03c5, B:279:0x03f7, B:283:0x0410, B:285:0x0416, B:287:0x041c, B:288:0x0474, B:292:0x047f, B:299:0x049a, B:303:0x04a5, B:305:0x04ae, B:307:0x04b4, B:308:0x04b9, B:310:0x04c1, B:312:0x04c7, B:316:0x04cd, B:318:0x04d1, B:320:0x04e1, B:322:0x04e9, B:328:0x04f1, B:330:0x0506, B:332:0x050a, B:333:0x0517, B:334:0x0531, B:335:0x0539, B:336:0x053a, B:337:0x0540, B:338:0x0541, B:339:0x0547, B:340:0x0421, B:343:0x042b, B:345:0x0439, B:348:0x0440, B:349:0x044b, B:350:0x044c, B:352:0x0409, B:353:0x046d, B:357:0x03d6, B:359:0x03e1, B:361:0x03e7, B:363:0x0548, B:364:0x0550, B:365:0x0551, B:366:0x055c, B:266:0x03b0, B:369:0x055d, B:370:0x0565, B:372:0x02f9, B:374:0x0307, B:376:0x031f, B:377:0x0327, B:379:0x0333, B:380:0x033e, B:382:0x02b8, B:384:0x02be, B:386:0x02ca, B:388:0x0566, B:389:0x056e, B:390:0x056f, B:391:0x0577, B:392:0x0578, B:393:0x0580, B:277:0x03cf), top: B:226:0x0293, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, ahwq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addProperty(com.android.vcard.VCardProperty r21) {
        /*
            Method dump skipped, instructions count: 1873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardEntry.addProperty(com.android.vcard.VCardProperty):void");
    }

    public void consolidateFields() {
        this.mNameData.displayName = constructDisplayName();
    }

    public ArrayList<ContentProviderOperation> constructInsertOperations(ContentResolver contentResolver, ArrayList<ContentProviderOperation> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (isIgnorable()) {
            return arrayList;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        Account account = this.mAccount;
        if (account != null) {
            newInsert.withValue("account_name", account.name);
            newInsert.withValue("account_type", this.mAccount.type);
        } else {
            newInsert.withValue("account_name", null);
            newInsert.withValue("account_type", null);
        }
        arrayList.add(newInsert.build());
        iterateAllData(new hiz(this, arrayList, size));
        return arrayList;
    }

    public final String getBirthday() {
        BirthdayData birthdayData = this.mBirthday;
        if (birthdayData != null) {
            return birthdayData.mBirthday;
        }
        return null;
    }

    public final List<VCardEntry> getChildlen() {
        return this.mChildren;
    }

    public String getDisplayName() {
        NameData nameData = this.mNameData;
        if (nameData.displayName == null) {
            nameData.displayName = constructDisplayName();
        }
        return this.mNameData.displayName;
    }

    public final List<EmailData> getEmailList() {
        return this.mEmailList;
    }

    public final List<ImData> getImList() {
        return this.mImList;
    }

    public final NameData getNameData() {
        return this.mNameData;
    }

    public final List<NicknameData> getNickNameList() {
        return this.mNicknameList;
    }

    public final List<NoteData> getNotes() {
        return this.mNoteList;
    }

    public final List<OrganizationData> getOrganizationList() {
        return this.mOrganizationList;
    }

    public final List<PhoneData> getPhoneList() {
        return this.mPhoneList;
    }

    public final List<PhotoData> getPhotoList() {
        return this.mPhotoList;
    }

    public final List<PostalData> getPostalList() {
        return this.mPostalList;
    }

    public List<Pair<String, String>> getUnknownXData() {
        return this.mUnknownXData;
    }

    public final List<WebsiteData> getWebsiteList() {
        return this.mWebsiteList;
    }

    public boolean isIgnorable() {
        hja hjaVar = new hja();
        iterateAllData(hjaVar);
        return hjaVar.a;
    }

    public final void iterateAllData(EntryElementIterator entryElementIterator) {
        entryElementIterator.onIterationStarted();
        entryElementIterator.onElementGroupStarted(this.mNameData.getEntryLabel());
        entryElementIterator.onElement(this.mNameData);
        entryElementIterator.onElementGroupEnded();
        iterateOneList(this.mPhoneList, entryElementIterator);
        iterateOneList(this.mEmailList, entryElementIterator);
        iterateOneList(this.mPostalList, entryElementIterator);
        iterateOneList(this.mOrganizationList, entryElementIterator);
        iterateOneList(this.mImList, entryElementIterator);
        iterateOneList(this.mPhotoList, entryElementIterator);
        iterateOneList(this.mWebsiteList, entryElementIterator);
        iterateOneList(this.mSipList, entryElementIterator);
        iterateOneList(this.mNicknameList, entryElementIterator);
        iterateOneList(this.mNoteList, entryElementIterator);
        iterateOneList(this.mAndroidCustomDataList, entryElementIterator);
        BirthdayData birthdayData = this.mBirthday;
        if (birthdayData != null) {
            entryElementIterator.onElementGroupStarted(birthdayData.getEntryLabel());
            entryElementIterator.onElement(this.mBirthday);
            entryElementIterator.onElementGroupEnded();
        }
        AnniversaryData anniversaryData = this.mAnniversary;
        if (anniversaryData != null) {
            entryElementIterator.onElementGroupStarted(anniversaryData.getEntryLabel());
            entryElementIterator.onElement(this.mAnniversary);
            entryElementIterator.onElementGroupEnded();
        }
        entryElementIterator.onIterationEnded();
    }

    public String toString() {
        hjb hjbVar = new hjb(this);
        iterateAllData(hjbVar);
        return hjbVar.toString();
    }

    public VCardEntry(int i) {
        this(i, null);
    }

    public static VCardEntry buildFromResolver(ContentResolver contentResolver) {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        return null;
    }

    public VCardEntry(int i, Account account) {
        this.mNameData = new NameData();
        hjh hjhVar = new hjh();
        this.prefComparator = hjhVar;
        this.preferredPhonePQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredEmailPQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredPostalPQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredOrganizationPQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredImPQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredPhotoPQueue = new PriorityQueue<>(10, hjhVar);
        this.preferredSipPQueue = new PriorityQueue<>(10, hjhVar);
        this.mVCardType = i;
        this.mAccount = account;
    }
}
