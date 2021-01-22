package org.thoughtcrime.securesms.components.settings.app.chats

data class ChatsSettingsState(
  val generateLinkPreviews: Boolean,
  val useAddressBook: Boolean,
  val keepMutedChatsArchived: Boolean,
  val useSystemEmoji: Boolean,
  val enterKeySends: Boolean,
  val chatBackupsEnabled: Boolean
  // JW: added extra preferences
  ,
  val keepViewOnceMessages: Boolean,
  val keepExpiringMessages: Boolean,
  val ignoreRemoteDelete: Boolean,
  val deleteMediaOnly: Boolean
)
