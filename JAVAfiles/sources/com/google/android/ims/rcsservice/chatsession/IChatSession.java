package com.google.android.ims.rcsservice.chatsession;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IChatSession extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IChatSession {
        static final int TRANSACTION_addUserToSession = 16;
        static final int TRANSACTION_endSession = 13;
        static final int TRANSACTION_getActiveSessionIds = 2;
        static final int TRANSACTION_getGroupInfo = 5;
        static final int TRANSACTION_getPreferredSessionByUser = 7;
        static final int TRANSACTION_getRemoteUserId = 3;
        static final int TRANSACTION_getSessionState = 6;
        static final int TRANSACTION_getSessionsByUser = 8;
        static final int TRANSACTION_getUpdatedGroupInfo = 28;
        static final int TRANSACTION_getUsersInSession = 4;
        static final int TRANSACTION_isGroupSession = 1;
        static final int TRANSACTION_isMessageRevocationSupported = 29;
        static final int TRANSACTION_joinSession = 14;
        static final int TRANSACTION_leaveSession = 15;
        static final int TRANSACTION_removeUserFromSession = 17;
        static final int TRANSACTION_reportRbmSpam = 25;
        static final int TRANSACTION_revokeMessage = 27;
        static final int TRANSACTION_sendGroupReport = 26;
        static final int TRANSACTION_sendIndicator = 21;
        static final int TRANSACTION_sendMessage = 18;
        static final int TRANSACTION_sendMessageTo = 19;
        static final int TRANSACTION_sendPrivateIndicator = 22;
        static final int TRANSACTION_sendPrivateMessage = 20;
        static final int TRANSACTION_sendReport = 23;
        static final int TRANSACTION_sendSuggestionPostBack = 24;
        static final int TRANSACTION_startGroupSession = 10;
        static final int TRANSACTION_startGroupSessionWithMessage = 11;
        static final int TRANSACTION_startGroupSessionWithMessageAndSubject = 12;
        static final int TRANSACTION_startSessionWithMessage = 9;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IChatSession {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.chatsession.IChatSession");
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult addUserToSession(long j, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult endSession(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long[] getActiveSessionIds() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                long[] createLongArray = transactAndReadException.createLongArray();
                transactAndReadException.recycle();
                return createLongArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public GroupInfo getGroupInfo(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                GroupInfo groupInfo = (GroupInfo) iax.a(transactAndReadException, GroupInfo.CREATOR);
                transactAndReadException.recycle();
                return groupInfo;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long getPreferredSessionByUser(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                long readLong = transactAndReadException.readLong();
                transactAndReadException.recycle();
                return readLong;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public String getRemoteUserId(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult getSessionState(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public long[] getSessionsByUser(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                long[] createLongArray = transactAndReadException.createLongArray();
                transactAndReadException.recycle();
                return createLongArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public String[] getUsersInSession(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public boolean isGroupSession(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(29, obtainAndWriteInterfaceToken);
                MessageRevocationSupportedResult messageRevocationSupportedResult = (MessageRevocationSupportedResult) iax.a(transactAndReadException, MessageRevocationSupportedResult.CREATOR);
                transactAndReadException.recycle();
                return messageRevocationSupportedResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult joinSession(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult leaveSession(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult removeUserFromSession(long j, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult reportRbmSpam(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult revokeMessage(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j2);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendIndicator(long j, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeString(str5);
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSession(String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
            public ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, chatMessage);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                ChatSessionServiceResult chatSessionServiceResult = (ChatSessionServiceResult) iax.a(transactAndReadException, ChatSessionServiceResult.CREATOR);
                transactAndReadException.recycle();
                return chatSessionServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.chatsession.IChatSession");
        }

        public static IChatSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.chatsession.IChatSession");
            if (queryLocalInterface instanceof IChatSession) {
                return (IChatSession) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    boolean isGroupSession = isGroupSession(readLong);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isGroupSession ? 1 : 0);
                    return true;
                case 2:
                    long[] activeSessionIds = getActiveSessionIds();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeSessionIds);
                    return true;
                case 3:
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    String remoteUserId = getRemoteUserId(readLong2);
                    parcel2.writeNoException();
                    parcel2.writeString(remoteUserId);
                    return true;
                case 4:
                    long readLong3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    String[] usersInSession = getUsersInSession(readLong3);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(usersInSession);
                    return true;
                case 5:
                    long readLong4 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    GroupInfo groupInfo = getGroupInfo(readLong4);
                    parcel2.writeNoException();
                    iax.e(parcel2, groupInfo);
                    return true;
                case 6:
                    long readLong5 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sessionState = getSessionState(readLong5);
                    parcel2.writeNoException();
                    iax.e(parcel2, sessionState);
                    return true;
                case 7:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    long preferredSessionByUser = getPreferredSessionByUser(readString);
                    parcel2.writeNoException();
                    parcel2.writeLong(preferredSessionByUser);
                    return true;
                case 8:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    long[] sessionsByUser = getSessionsByUser(readString2);
                    parcel2.writeNoException();
                    parcel2.writeLongArray(sessionsByUser);
                    return true;
                case 9:
                    String readString3 = parcel.readString();
                    ChatMessage chatMessage = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult startSessionWithMessage = startSessionWithMessage(readString3, chatMessage);
                    parcel2.writeNoException();
                    iax.e(parcel2, startSessionWithMessage);
                    return true;
                case 10:
                    String[] createStringArray = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult startGroupSession = startGroupSession(createStringArray);
                    parcel2.writeNoException();
                    iax.e(parcel2, startGroupSession);
                    return true;
                case 11:
                    String[] createStringArray2 = parcel.createStringArray();
                    ChatMessage chatMessage2 = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult startGroupSessionWithMessage = startGroupSessionWithMessage(createStringArray2, chatMessage2);
                    parcel2.writeNoException();
                    iax.e(parcel2, startGroupSessionWithMessage);
                    return true;
                case 12:
                    String[] createStringArray3 = parcel.createStringArray();
                    ChatMessage chatMessage3 = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult startGroupSessionWithMessageAndSubject = startGroupSessionWithMessageAndSubject(createStringArray3, chatMessage3, readString4);
                    parcel2.writeNoException();
                    iax.e(parcel2, startGroupSessionWithMessageAndSubject);
                    return true;
                case 13:
                    long readLong6 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult endSession = endSession(readLong6);
                    parcel2.writeNoException();
                    iax.e(parcel2, endSession);
                    return true;
                case 14:
                    long readLong7 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult joinSession = joinSession(readLong7);
                    parcel2.writeNoException();
                    iax.e(parcel2, joinSession);
                    return true;
                case 15:
                    long readLong8 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult leaveSession = leaveSession(readLong8);
                    parcel2.writeNoException();
                    iax.e(parcel2, leaveSession);
                    return true;
                case 16:
                    long readLong9 = parcel.readLong();
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult addUserToSession = addUserToSession(readLong9, readString5);
                    parcel2.writeNoException();
                    iax.e(parcel2, addUserToSession);
                    return true;
                case 17:
                    long readLong10 = parcel.readLong();
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult removeUserFromSession = removeUserFromSession(readLong10, readString6);
                    parcel2.writeNoException();
                    iax.e(parcel2, removeUserFromSession);
                    return true;
                case 18:
                    long readLong11 = parcel.readLong();
                    ChatMessage chatMessage4 = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendMessage = sendMessage(readLong11, chatMessage4);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendMessage);
                    return true;
                case 19:
                    String readString7 = parcel.readString();
                    ChatMessage chatMessage5 = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendMessageTo = sendMessageTo(readString7, chatMessage5);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendMessageTo);
                    return true;
                case 20:
                    long readLong12 = parcel.readLong();
                    String readString8 = parcel.readString();
                    ChatMessage chatMessage6 = (ChatMessage) iax.a(parcel, ChatMessage.CREATOR);
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendPrivateMessage = sendPrivateMessage(readLong12, readString8, chatMessage6);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendPrivateMessage);
                    return true;
                case 21:
                    long readLong13 = parcel.readLong();
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendIndicator = sendIndicator(readLong13, readInt);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendIndicator);
                    return true;
                case 22:
                    long readLong14 = parcel.readLong();
                    String readString9 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendPrivateIndicator = sendPrivateIndicator(readLong14, readString9, readInt2);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendPrivateIndicator);
                    return true;
                case 23:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    long readLong15 = parcel.readLong();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendReport = sendReport(readString10, readString11, readString12, readLong15, readInt3);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendReport);
                    return true;
                case 24:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendSuggestionPostBack = sendSuggestionPostBack(readString13, readString14, readString15, readString16, readString17);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendSuggestionPostBack);
                    return true;
                case 25:
                    String readString18 = parcel.readString();
                    String readString19 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult reportRbmSpam = reportRbmSpam(readString18, readString19);
                    parcel2.writeNoException();
                    iax.e(parcel2, reportRbmSpam);
                    return true;
                case 26:
                    long readLong16 = parcel.readLong();
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    long readLong17 = parcel.readLong();
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult sendGroupReport = sendGroupReport(readLong16, readString20, readString21, readLong17, readInt4);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendGroupReport);
                    return true;
                case 27:
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult revokeMessage = revokeMessage(readString22, readString23);
                    parcel2.writeNoException();
                    iax.e(parcel2, revokeMessage);
                    return true;
                case 28:
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ChatSessionServiceResult updatedGroupInfo = getUpdatedGroupInfo(readString24, readString25);
                    parcel2.writeNoException();
                    iax.e(parcel2, updatedGroupInfo);
                    return true;
                case 29:
                    long readLong18 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    MessageRevocationSupportedResult isMessageRevocationSupported = isMessageRevocationSupported(readLong18);
                    parcel2.writeNoException();
                    iax.e(parcel2, isMessageRevocationSupported);
                    return true;
                default:
                    return false;
            }
        }
    }

    ChatSessionServiceResult addUserToSession(long j, String str);

    ChatSessionServiceResult endSession(long j);

    long[] getActiveSessionIds();

    GroupInfo getGroupInfo(long j);

    long getPreferredSessionByUser(String str);

    String getRemoteUserId(long j);

    ChatSessionServiceResult getSessionState(long j);

    long[] getSessionsByUser(String str);

    ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2);

    String[] getUsersInSession(long j);

    boolean isGroupSession(long j);

    MessageRevocationSupportedResult isMessageRevocationSupported(long j);

    ChatSessionServiceResult joinSession(long j);

    ChatSessionServiceResult leaveSession(long j);

    ChatSessionServiceResult removeUserFromSession(long j, String str);

    ChatSessionServiceResult reportRbmSpam(String str, String str2);

    ChatSessionServiceResult revokeMessage(String str, String str2);

    ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i);

    ChatSessionServiceResult sendIndicator(long j, int i);

    ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage);

    ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage);

    ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i);

    ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage);

    ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i);

    ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5);

    ChatSessionServiceResult startGroupSession(String[] strArr);

    ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage);

    ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str);

    ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage);
}
