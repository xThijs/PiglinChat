# LPC with Mini-message Support!

A chat formatting plugin for LuckPerms!

## Credits: https://github.com/wikmor/LPC (@wikmor)


## Config.yml
````yml
# LPC Configuration
# Please read the https://luckperms.net/wiki/Prefixes,-Suffixes-&-Meta before you set up.
#
# Placeholders:
# {message} - the chat message
# {name} - the player's name
# {displayname} - the player's display name / nickname
# {world} - the world name of the player's current world
# {prefix} - the player's highest priority prefix
# {suffix} - the player's highest priority suffix
# {prefixes} - the player's prefixes sorted by the highest priority
# {suffixes} - the player's suffixes sorted by the highest priority
# {username-color} - the player's or the group's username color
# {message-color} - the player's or the group's message color

# WARNING: Prefixes, Suffixes, message-color etc. needs to be Minimessage Colorcodes and not Legacy!

# To reload the configuration, run '/lpc reload' command. Make sure you have the 'lpc.reload' permission assigned.
# More information can be found at the Github.
chat-format: "{prefix}{name}<reset>: {message}"

# Set the format per group.
# Note: Option for more advanced users. Remove comments to run.
group-formats:
#  default: "[default] {name}<reset>: {message}"
#  admin: "[admin] {name}<reset>: {message}"
````


> {message}: The chat message
{name}: The player's name
{displayname}: The player's display name / nickname
{world}: The world name of the player's current world
{prefix}: The player's highest priority prefix
{suffix}: The player's highest priority suffix
{prefixes}: The player's prefixes sorted by the highest priority
{suffixes}: The player's suffixes sorted by the highest priority
{username-color}: The player's or the group's username color
{message-color}: The player's or the group's message color

